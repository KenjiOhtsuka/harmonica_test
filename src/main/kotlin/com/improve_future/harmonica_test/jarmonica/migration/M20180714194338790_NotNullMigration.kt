package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration
import com.improve_future.harmonica.core.Dbms

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
            blob("blob_column", nullable = false)
            date("date_column", nullable = false)
            time("time_column", nullable = false)
            dateTime("date_time_column", nullable = false)
            timestamp("timestamp_column", nullable = false)
            text("text_column", nullable = false)
            refer("normal_table")
        }
        val tableName = "not_null_table_for_add"
        createTable(tableName) {}
        addIntegerColumn(tableName, "integer_column", nullable = false)
        addVarcharColumn(tableName, "varchar_column", nullable = false)
        addDecimalColumn(tableName, "decimal_column", nullable = false)
        addBooleanColumn(tableName, "boolean_column", nullable = false)
        addBlobColumn(tableName, "blob_column", nullable = false)
        addDateColumn(tableName, "date_column", nullable = false)
        addTimeColumn(tableName, "time_column", nullable = false)
        addDateTimeColumn(tableName, "date_time_column", nullable = false)
        addTimestampColumn(tableName, "timestamp_column", nullable = false)
        addTextColumn(tableName, "text_column", nullable = false)
        if (config.dbms != Dbms.MySQL) {
            addForeignKey(
                "not_null_table", "integer_column",
                "not_null_table_for_add", "id"
            )
        }
    }

    override fun down() {
        dropForeignKey("not_null_table", "integer_column")
        dropTable("not_null_table_for_add")
        dropTable("not_null_table")
    }
}