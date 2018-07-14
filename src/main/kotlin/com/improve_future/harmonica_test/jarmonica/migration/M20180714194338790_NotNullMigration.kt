package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration

/**
 * NotNullMigration
 */
class M20180714194338790_NotNullMigration : AbstractMigration() {
    override fun up() {
        createTable("not_null_name") {
            integer("integer_column", nullable = false)
            varchar("varchar_column", nullable = false)
            decimal("decimal_column", nullable = false)
            text("text_column", nullable = false)
        }
    }

    override fun down() {
        dropTable("not_null_name")
    }
}