# Introduction to Relational DBs

Think about the number of options we have when it comes to storing data

*   Sticky notes
*   Paper filing systems
*   Electronic file systems
*   Text documents
*   Excel spreadsheets

What is a limitation that we will face with each of these?

*   **_We have no way to effectively search and sort the data stored inside of these storage systems_**

The solution: **_DATABASES!_**

---

Say that I am a record store owner, what are some things that I would want to keep track of in my database?

*   Customers
*   Albums
*   Transactions


What are some things about Customers that we will want to store?

*   First name
*   Last name
*   Phone number
*   Email address

Ok, what are some things about Albums that we will want to store in our database?

*   Album name
*   Artist name
*   Release date
*   Record label
*   Price
*   Number in inventory

 

Nice! We also have Transactions, what are some things about these we would want to store?

*   Customer
*   Album
*   Date
*   Amount

| first_name | last_name | email_address           | phone_number |
|------------|-----------|-------------------------|--------------|
| John       | Smith     | jsmith@gmail.com        | 555-123-4567 |
| Bill       | Johnson   | bill.johnson@gmail.com  | 787-555-9876 |
| Angelina   | Mendoza   | angel.mendoza@yahoo.com | 404-101-1346 |
| Yosef      | Saleh     | yosef_saleh@aol.com     | 847-648-8134 |
---

First, let's define what a database is…well?

*   **_A database is a container that holds tables and other SQL structures related to those tables._**

Here in the Information Age, databases are prevalent in our daily lives - whether we realize it or not. Every time you

*   **_Querying_**


We've mentioned that our database will store tables, but we haven't really defined what a table is exactly.

*   **_A table is the structure inside of a database that contains data, which is organized into columns and rows._**

Remember those attributes of Customers, Albums, and Transactions we identified earlier? Well those become our columns, but what exactly is a column?

*   **_A column is a piece of data stored by a table._**

So what does that make a row in our table?

*   **_A table row contains all the information about one object in your table._**

If you have done any research into databases and the concepts/buzzwords associated with them, you may have seem the term _schema_ thrown around. There are several ways that schemas might be described, so let's discuss the meanings of this term.

*   **_A schema can refer to:_**
    *   **_ a visual representation of a database_**
    *   **_a set of rules governing the database_**
    *   **_a set of database entities belonging to a certain user or group of users_**
        *   the Sales department has access and control over certain tables relating to sales in the DB
        *   the HR department has access and control over certain tables relating to personnel in the DB

Ok, now we have  a good understanding of what both a database and a table are, and how tables use columns and rows to store our data in an organized way. So, back to the question from earlier: Isn't this just like an Excel spreadsheet, what is the advantage to storing our data in a database?

*   **_Notice that all of the tables in our database are connection to at least one other table, the Transactions table - which contains a column for Customer info and another column for Album info._**

When we have a database that creates connections between our tables, this makes it a **_relational database_**. Relational databases are what we will be working with throughout this training.

