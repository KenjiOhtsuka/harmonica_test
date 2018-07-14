package com.improve_future.harmonica_test.jarmonica.config

import com.improve_future.harmonica.core.DbConfig
import com.improve_future.harmonica.core.Dbms

class MySql: DbConfig({
    dbms = Dbms.MySQL
    user = "developer"
    password = "developer"
    host = "127.0.0.1"
    dbName = "harmonica_test"
    port = 3306
})