package com.improve_future.harmonica_test.jarmonica.migration

import com.improve_future.harmonica.core.AbstractMigration

/**
 * ThirdMigration
 */
class M20180714194840311_DefaultMigration : AbstractMigration() {
    override fun up() {
        createTable("default_column") {
            integer("integer_column", default = 1)
            varchar("varchar_column", default = "text")
            decimal("decimal_column", default = 1.1)
            text("text_column", default = "text")
        }
    }

    override fun down() {
        dropTable("default_column")
    }
}