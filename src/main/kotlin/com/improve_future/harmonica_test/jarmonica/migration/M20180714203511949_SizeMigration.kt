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
            text("text_column")
        }
    }

    override fun down() {
        dropTable("size_table")
    }
}