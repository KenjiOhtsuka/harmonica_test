package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration

/**
 * NormalMigration
 */
class M20180714192339748_NormalMigration : AbstractMigration() {
    override fun up() {
        createTable("normal_table") {
            integer("integer_column")
            varchar("varchar_column")
            decimal("decimal_column")
            boolean("boolean_column")
            date("date_column")
            text("text_column")
        }
        val tableName = "normal_table_for_add"
        createTable(tableName) {}
        addIntegerColumn(tableName,"integer_column")
        addVarcharColumn(tableName, "varchar_column")
        addDecimalColumn(tableName, "decimal_column")
        addBooleanColumn(tableName, "boolean_column")
        addDateColumn(tableName, "date_column")
        addTextColumn(tableName, "text_column")
    }

    override fun down() {
        dropTable("normal_table_for_add")
        dropTable("normal_table")
    }
}