# Harmonica Test

This project is fot the test of [Harmonica](https://github.com/KenjiOhtsuka/harmonica), with actual DBMS.

## Database Preparation

with user `developer` and the password `developer`.

### PostgreSQL

```sql
CREATE DATABASE harmonica_test;
```

### MySQL

```sql
CREATE USER developer@localhost identified by 'developer';
CREATE DATABASE harmonica_test;
GRANT ALL PRIVILEGES ON harmonica_test.* TO developer@localhost;
```

## How to Test

Execute the all following scripts and check the databases.

### For PostgreSQL

```bash
./gradlew jarmonicaUp
```

```bash
./gradlew jarmonicaDown
```

### For MySQL

```bash
./gradlew jarmonicaUp -Penv=MySql
```

```bash
./gradlew jarmonicaDown -Penv=```

### For SQLite

```bash
./gradlew jarmonicaUp -Penv=Sqlite
```

```bash
./gradlew jarmonicaDown -Penv=SQLite
```