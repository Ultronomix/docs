# What is Normalization?

 
Definition:

**_The process of removing redundancies and ensuring that data dependencies are logically stored._**


The idea behind normalization is that every table should be about a specific topic and that only the columns which support that topic are included. Databases can be normalized to varying degrees, which are known as **_Normal Forms (NFs)_**. There are several NFs, we will only focus on a few of these, and we will explain them in more depth soon:


*   **Unnormalized Form (UNF)**
*   **1st Normal Form (1NF)**
*   **2nd Normal Form (2NF)**
*   **3rd Normal Form (3NF)**
*   Elementary Key Normal Form (EKNF)
*   Boyce-Codd Normal Form (BCNF)
*   4th Normal Form (4NF)
*   5th Normal Form (5NF)
*   6th Normal Form (6NF)
*   Domain/key Normal Form (DKNF)

 

**The ones we care about for our purposes**

 

## Why do we need normalization?


There are three main reasons why we would want to normalize our database:

1. Minimize duplicate data
2. Minimize or avoid data modification issues
3. Simplify queries


Consider the following table:


**SalesStaff**


<table>
  <tr>
   <td><strong>employee_id [PK]</strong>
   </td>
   <td><strong>salesperson</strong>
   </td>
   <td><strong>sales_office</strong>
   </td>
   <td><strong>office_number</strong>
   </td>
   <td><strong>customer1</strong>
   </td>
   <td><strong>customer2</strong>
   </td>
   <td><strong>customer3</strong>
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
1003</p>

   </td>
   <td>John Jacobs
   </td>
   <td>Chicago
   </td>
   <td>321-555-3213
   </td>
   <td>Toyota
   </td>
   <td>Nissan
   </td>
   <td> 
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
1004</p>

   </td>
   <td>Jack Wilson
   </td>
   <td>Reston
   </td>
   <td>721-545-1515
   </td>
   <td>Revature
   </td>
   <td>Apple
   </td>
   <td>Synmatec
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
1005</p>

   </td>
   <td>Betty White
   </td>
   <td>Atlanta
   </td>
   <td>404-721-8887
   </td>
   <td>Chromalloy
   </td>
   <td> 
   </td>
   <td> 
   </td>
  </tr>
</table>



Notice that this table has a lot of things going on in it, it is:

*   identifying the organization's salespeople
*   it is listing the sales offices and phone numbers
*   associating a salesperson with a sales office
*   showing each salesperson's customers



Consider the following possibilities:

*   What if we moved the Chicago office to a different city?
*   What if John Jacobs quits, and his data is removed from this table?
*   Is the information in this table easily query-able

 

## Normal Forms

 

As mentioned previously, there are _several_ degrees of normalization. However, for our purposes we are only going to focus on the first three Normal Forms: 1NF, 2NF, and 3NF.

 

**1st Normal Form**



*   The information is stored in a relational table and each column contains atomic values, and there are no repeating groups of columns. Also, each record has a unique identifier.

 

Using our previous example, let's make it comply with 1NF:

 

**SalesStaff**


<table>
  <tr>
   <td><strong>employee_id [PK]</strong>
   </td>
   <td><strong>sales_person_fn</strong>
   </td>
   <td><strong>sales_person_ln</strong>
   </td>
   <td><strong>sales_office</strong>
   </td>
   <td><strong>office_number</strong>
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
1003</p>

   </td>
   <td>John
   </td>
   <td>Jacobs
   </td>
   <td>Chicago
   </td>
   <td>321-555-3213
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
1004</p>

   </td>
   <td>Jack
   </td>
   <td>Wilson
   </td>
   <td>Reston
   </td>
   <td>721-545-1515
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
1005</p>

   </td>
   <td>Betty
   </td>
   <td>White
   </td>
   <td>Atlanta
   </td>
   <td>404-721-8887
   </td>
  </tr>
</table>


 

 

**Customer**


<table>
  <tr>
   <td><strong>customer_id [PK]</strong>
   </td>
   <td><strong>employee_id</strong>
   </td>
   <td><strong>customer_name</strong>
   </td>
   <td><strong>customer_city</strong>
   </td>
   <td><strong>postal_code</strong>
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1000</p>

   </td>
   <td><p style="text-align: right">
1003</p>

   </td>
   <td>Toyota
   </td>
   <td>Arlington Heights
   </td>
   <td>60004
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1010</p>

   </td>
   <td><p style="text-align: right">
1003</p>

   </td>
   <td>Nissan
   </td>
   <td>Evanston
   </td>
   <td>60201
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1020</p>

   </td>
   <td><p style="text-align: right">
1004</p>

   </td>
   <td>Revature
   </td>
   <td>Reston
   </td>
   <td>20190
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1030</p>

   </td>
   <td><p style="text-align: right">
1004</p>

   </td>
   <td>Oracle
   </td>
   <td>Reston
   </td>
   <td>20190
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1040</p>

   </td>
   <td><p style="text-align: right">
1004</p>

   </td>
   <td>Synmatec
   </td>
   <td>Herndon
   </td>
   <td>20171
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1050</p>

   </td>
   <td><p style="text-align: right">
1005</p>

   </td>
   <td>Chromalloy
   </td>
   <td>Newnan
   </td>
   <td>30263
   </td>
  </tr>
</table>


 

 **2nd Normal Form**



*   The table must comply with 1NF.
*   All of the columns in the table depend on the primary key of that table

 

To have our DB comply with 2NF, we need to take a closer look at our Customer table. Notice that employee_id does not actually relate to the rest of the data contained in the table? Let's make this 2NF-compliant.

 

**Customer**


<table>
  <tr>
   <td><strong>customer_id [PK]</strong>
   </td>
   <td><strong>customer_name</strong>
   </td>
   <td><strong>customer_city</strong>
   </td>
   <td><strong>postal_code</strong>
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1000</p>

   </td>
   <td>Toyota
   </td>
   <td>Arlington Heights
   </td>
   <td>60004
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1010</p>

   </td>
   <td>Nissan
   </td>
   <td>Evanston
   </td>
   <td>60201
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1020</p>

   </td>
   <td>Revature
   </td>
   <td>Reston
   </td>
   <td>20190
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1030</p>

   </td>
   <td>Oracle
   </td>
   <td>Reston
   </td>
   <td>20190
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1040</p>

   </td>
   <td>Synmatec
   </td>
   <td>Herndon
   </td>
   <td>20171
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1050</p>

   </td>
   <td>Chromalloy
   </td>
   <td>Newnan
   </td>
   <td>30263
   </td>
  </tr>
</table>


 

 

**StaffSalesCustomer**


<table>
  <tr>
   <td><strong>customer_id [PK]</strong>
   </td>
   <td><strong>employee_id</strong>
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1000</p>

   </td>
   <td><p style="text-align: right">
1003</p>

   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1010</p>

   </td>
   <td><p style="text-align: right">
1003</p>

   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1020</p>

   </td>
   <td><p style="text-align: right">
1004</p>

   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1030</p>

   </td>
   <td><p style="text-align: right">
1004</p>

   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1040</p>

   </td>
   <td><p style="text-align: right">
1004</p>

   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1050</p>

   </td>
   <td><p style="text-align: right">
1005</p>

   </td>
  </tr>
</table>


 

 

**3rd Normal Form**



*   The table must comply with both 1NF and 2NF
*   All of the columns are not _transitively dependent_ upon the primary key

 

We are almost done normalizing our DB! There is only one small issue left in one of our tables. Notice that the postal_code in our Customer table, it is not_ directly_ related to customers themselves. Instead it is dependent upon the customer_city column. This is known as a **_transitive dependency_**, and in order to comply with 3NF we need to correct this.

 

**Customer**


<table>
  <tr>
   <td><strong>customer_id [PK]</strong>
   </td>
   <td><strong>customer_name</strong>
   </td>
   <td><strong>customer_city</strong>
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1000</p>

   </td>
   <td>Toyota
   </td>
   <td>Arlington Heights
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1010</p>

   </td>
   <td>Nissan
   </td>
   <td>Evanston
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1020</p>

   </td>
   <td>Revature
   </td>
   <td>Reston
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1030</p>

   </td>
   <td>Oracle
   </td>
   <td>Reston
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1040</p>

   </td>
   <td>Synmatec
   </td>
   <td>Herndon
   </td>
  </tr>
  <tr>
   <td><p style="text-align: right">
C1050</p>

   </td>
   <td>Chromalloy
   </td>
   <td>Newnan
   </td>
  </tr>
</table>


 

 

**PostalCode**


<table>
  <tr>
   <td><strong>postal_code</strong>
   </td>
   <td><strong>city</strong>
   </td>
  </tr>
  <tr>
   <td>60004
   </td>
   <td>Arlington Heights
   </td>
  </tr>
  <tr>
   <td>60201
   </td>
   <td>Evanston
   </td>
  </tr>
  <tr>
   <td>20190
   </td>
   <td>Reston
   </td>
  </tr>
  <tr>
   <td>20171
   </td>
   <td>Herndon
   </td>
  </tr>
  <tr>
   <td>30263
   </td>
   <td>Newnan
   </td>
  </tr>
</table>


 

### How Much Is Too Much? Overnormalization

 

Too much of anything, no matter how good, can be a bad thing. There are several scenarios in which it is not necessary to normalize past a certain point. In fact, if we normalize too much, we can actually begin to decrease our data accessibility, which in turn can decrease query efficiency. Most of the time, you will not see many DBs that normalize beyond the 3rd (maybe 4th) normal form. Though these high normal forms do have their use cases, we will not leverage them for our purposes.
