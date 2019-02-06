package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration
import com.improve_future.harmonica.core.Dbms
import com.improve_future.harmonica.core.RawSql

/**
 * NormalMigration
 */
class M20180714192339748_NormalMigration : AbstractMigration() {
    override fun up() {
        createTable("normal_table") {
            integer("integer_column").comment("this is integer column")
            varchar("varchar_column").comment("this is varchar column")
            decimal("decimal_column")
            boolean("boolean_column")
            blob("blob_column")
            date("date_column")
            time("time_column")
            dateTime("date_time_column")
            timestamp("timestamp_column")
            text("text_column")
            comment("this is normal table.")
        }
        val tableName = "normal_table_for_add"
        createTable(tableName) {}
        addIntegerColumn(tableName, "integer_column")
        addVarcharColumn(tableName, "varchar_column")
        addDecimalColumn(tableName, "decimal_column")
        addBooleanColumn(tableName, "boolean_column")
        addBlobColumn(tableName, "blob_column")
        addDateColumn(tableName, "date_column")
        if (config.dbms == Dbms.SQLite) {
            addTimeColumn(tableName, "time_column", default = "12:34:56")
        } else {
            addTimeColumn(tableName, "time_column")
        }
        if (config.dbms == Dbms.SQLite) {
            addDateTimeColumn(tableName, "date_time_column", default = "2019-01-01 12:34:56")
        } else {
            addDateTimeColumn(tableName, "date_time_column")
        }
        if (config.dbms == Dbms.SQLite) {
            addTimestampColumn(tableName, "timestamp_column", default = "2019-01-01 12:34:56")
        } else {
            addTimestampColumn(tableName, "timestamp_column")
        }
        addTextColumn(tableName, "text_column")

        createIndex("normal_table", "integer_column")
        createIndex("normal_table", listOf("date_column", "time_column"))
    }

    override fun down() {
        dropIndex("normal_table", "normal_table_date_column_time_column_idx")
        dropIndex("normal_table", "normal_table_integer_column_idx")
        dropTable("normal_table_for_add")
        dropTable("normal_table")
    }
}