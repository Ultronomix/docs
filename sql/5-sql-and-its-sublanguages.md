# What is SQL?

 

Structured Query Language (SQL), is pronounced either as "Sequel" or by the individual letters "S-Q-L".

 

Overview

*   Used to design, access and manipulate data within a database
*   ANSI standard
*   Every vendor has its own implementation of SQL
*   Not a procedural language, but a declarative one
    *   Although there is something called **_PL/SQL_**: **_Procedure Language extension for SQL_** which many RDBMS vendors provide support for

 

## Data Manipulation Language


Data manipulation language (DML) statements access and manipulate data in existing schema objects. These statements do not implicitly commit the current transaction.


Keywords:


*   `INSERT`
*   `SELECT`
*   `UPDATE`
*   `DELETE`

The `SELECT` statement is the most limited DML statement, as it can only access data and cannot manipulate data stored within our database. However, it can operate on accessed data before returning the results of the query.

 

## Data Definition Language


Data Definition Language (DDL) statements allow us to perform several tasks on our database, including:

*   Creating, altering, and dropping schema objects
*   Analyze information on a table, index, or cluster
*   Establish auditing options
*   Add comments to the data dictionary

 

Keywords:

*   `CREATE`
*   `ALTER`
*   `DROP`
*   `TRUNCATE`

 

It is important to note that all DDL statements implicitly commit transactions, and therefore cannot be rolled back to a previous state.

 
## Transaction Control Language


Transaction Control Language (TCL) statements manage changes made by DML statements.


Keywords:

*   `COMMIT`
*   `ROLLBACK`
*   `SAVEPOINT`
*   `SET TRANSACTION`

 

## Data Query Language


Although several vendors classify the `SELECT` statement as a DML statement, there are several resources in which it is set aside into its own sublanguage, known as Data Query Language (DQL).


Keyword:

*   `SELECT`

 

So, if you are asked what are the SQL sub-languages, be sure to mention DQL just to be safe. Also, it is ok to classify the `SELECT` statement as a DML statement, but clarify that it is also sometimes called a DQL statement.

 

## Data Control Language


Restricting and granting access to our schemas is an important part of maintaining proper security over a database, and using Data Control Language (DCL) statements we can do just that.


Keywords:

*   `GRANT`
*   `REVOKE`
