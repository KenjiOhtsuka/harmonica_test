import com.improve_future.harmonica.core.AbstractMigration

/**
 * SecondMigration
 */
class M20180714192339748_SecondMigration : AbstractMigration() {
    override fun up() {
        createTable("table_name") {
            integer("column_1")
            varchar("column_2")
        }
    }

    override fun down() {
        dropTable("table_name")
    }
}