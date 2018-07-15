package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration

/**
 * NotNullMigration
 */
class M20180714194338790_NotNullMigration : AbstractMigration() {
    override fun up() {
        createTable("not_null_table") {
            integer("integer_column", nullable = false)
            varchar("varchar_column", nullable = false)
            decimal("decimal_column", nullable = false)
            boolean("boolean_column", nullable = false)
            date("date_column", nullable = false)
            text("text_column", nullable = false)
        }
        val tableName = "not_null_table_for_add"
        createTable(tableName) {}
        addIntegerColumn(tableName,"integer_column", nullable = false)
        addVarcharColumn(tableName, "varchar_column", nullable = false)
        addDecimalColumn(tableName, "decimal_column", nullable = false)
        addBooleanColumn(tableName, "boolean_column", nullable = false)
        addDateColumn(tableName, "date_column", nullable = false)
        addTextColumn(tableName, "text_column", nullable = false)
    }

    override fun down() {
        dropTable("not_null_table_for_add")
        dropTable("not_null_table")
    }
}