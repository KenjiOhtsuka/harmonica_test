package com.improve_future.harmonica_test.jarmonica.config

import com.improve_future.harmonica.core.DbConfig
import com.improve_future.harmonica.core.Dbms

class Sqlite: DbConfig({
    dbms = Dbms.SQLite
    dbName = "harmonica_test"
})