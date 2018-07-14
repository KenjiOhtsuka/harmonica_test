package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration

/**
 * NormalMigration
 */
class M20180714192339748_NormalMigration : AbstractMigration() {
    override fun up() {
        createTable("first_table") {
            integer("integer_column")
            varchar("varchar_column")
            decimal("decimal_column")
            text("text_column")
        }
    }

    override fun down() {
        dropTable("first_table")
    }
}