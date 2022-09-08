# JDBC
- Java DataBase Connectivity
  - It is a library that allows us to interact with a SQL data from Java
- Every Single database has a different RDBMS
  - Postgres
  - MySQL
  - Oracle SQL
- You must install a driver for your RDBMS in Java to intreact with the database
  - We can do this easily with Maven!

## Interfaces to know
- Connection
  - Represents a connection to your database
- Statement
  - Create a sql statement that you can execute
  - There is no good reason to ever use just statement
- PreparedStatement
  - Create a parameterized sql statment (?)
  - Also gives some protection against SQL injection
    - **SQL Injection** is accidentally executing a malicous SQL statment
- ResultSet
  - Contains all the records from a query

# DAO
- Data Access Object
- A class that performs **CRUD** operations for a single Entity
  - Create
  - Read
  - Update
  - Delete
- Allows us to put all code related to interacting with the DB into a single manageable class
- **Seperation of Conerns**
  - Desiging our code to handle a specific duty 
  - Do not have God-Classes where a single class tries to do everything
  - Try to make code horizontal NOT vertical