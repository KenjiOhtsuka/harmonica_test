package com.improve_future.harmonica_test.jarmonica

import com.improve_future.harmonica.core.AbstractMigration

/**
 * Size Migration
 */
class M20180714203511949_SizeMigration : AbstractMigration() {
    override fun up() {
        createTable("size_table") {
            integer("integer_column")
            varchar("varchar_column", size = 1)
            decimal("decimal_column", 5, 2)
            boolean("boolean_column")
            date("date_column")
            text("text_column")
        }
        val tableName = "size_table_for_add"
        createTable(tableName) {}
        addIntegerColumn(tableName,"integer_column")
        addVarcharColumn(tableName, "varchar_column", size = 1)
        addDecimalColumn(
            tableName, "decimal_column", precision = 5, scale = 2)
        addBooleanColumn(tableName, "boolean_column")
        addDateColumn(tableName, "date_column")
        addTextColumn(tableName, "text_column")
    }

    override fun down() {
        dropTable("size_table_for_add")
        dropTable("size_table")
    }
}