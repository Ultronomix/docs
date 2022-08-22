# Common `psql` commands

- Connecting to a local running database as the default user: `psql -U postgres -h localhost`
- Connecting to a local running database as any known user: `psql -U <USERNAME> -h localhost`
- Connecting to a remote running database as any known user: `psql -U <USERNAME> -h <HOST_ADDRESS>`
- Executing a SQL script file using `psql`: `psql -U <USERNAME> -h <HOST_ADDRESS> -f <SQL_FILE_NAME>`
