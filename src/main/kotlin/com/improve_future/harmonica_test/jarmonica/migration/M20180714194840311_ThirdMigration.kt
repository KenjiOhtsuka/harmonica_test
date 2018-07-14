import com.improve_future.harmonica.core.AbstractMigration

/**
 * ThirdMigration
 */
class M20180714194840311_ThirdMigration : AbstractMigration() {
    override fun up() {
        createTable("default_column") {
            integer("integer_column", default = 1)
            varchar("varchar_column", default = "text")
            text("text_column", default = "text")
            decimal("decimal_column", default = 1.1)
        }
    }

    override fun down() {
        dropTable("table_name")
    }
}