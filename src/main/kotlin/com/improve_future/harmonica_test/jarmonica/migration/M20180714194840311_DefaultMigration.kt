package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration
import java.time.LocalDate
import java.util.*

/**
 * ThirdMigration
 */
class M20180714194840311_DefaultMigration : AbstractMigration() {
    override fun up() {
        createTable("default_table") {
            integer("integer_column", default = 1)
            varchar("varchar_column", default = "text")
            decimal("decimal_column", default = 1.1)
            boolean("boolean_column", default = true)
            date("date_column_1", default = Date())
            date("date_column_2", default = LocalDate.now())
            date("date_column_3", default = "2018-01-02")
            text("text_column", default = "text")
        }
        val tableName = "default_table_for_add"
        createTable(tableName) {}
        addIntegerColumn(tableName,"integer_column", default = 1)
        addVarcharColumn(tableName, "varchar_column", default = "text")
        addDecimalColumn(tableName, "decimal_column", default = 1.1)
        addBooleanColumn(tableName, "boolean_column", default = false)
        addDateColumn(tableName, "date_column_1", default = Date())
        addDateColumn(tableName, "date_column_2", default = LocalDate.now())
        addDateColumn(tableName, "date_column_3", default = "2018-01-02")
        addTextColumn(tableName, "text_column", default = "text")
    }

    override fun down() {
        dropTable("default_table_for_add")
        dropTable("default_table")
    }
}