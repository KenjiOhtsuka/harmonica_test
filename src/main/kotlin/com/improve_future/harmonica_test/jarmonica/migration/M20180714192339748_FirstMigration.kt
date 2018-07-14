import com.improve_future.harmonica.core.AbstractMigration

/**
 * FirstMigration
 */
class M20180714192339748_FirstMigration : AbstractMigration() {
    override fun up() {
        createTable("first_table") {
            integer("integer column")
            varchar("varchar column")
            decimal("decimal_column")
            text("text_column")
        }
    }

    override fun down() {
        dropTable("first_table")
    }
}