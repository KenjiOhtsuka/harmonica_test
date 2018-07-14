import com.improve_future.harmonica.core.AbstractMigration

/**
 * ThirdMigration
 */
class M20180714194840311_ThirdMigration : AbstractMigration() {
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