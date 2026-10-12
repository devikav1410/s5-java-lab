# Module 3 - Java Database Connectivity (JDBC) Lab

1. **JDBC Architecture & Basic Database Connection** [orig. Roll 20, Q1]
   Write a Java program to connect to a MySQL database using JDBC and display a successful connection message.
   - File: `jdbc.java`

2. **MySQL CRUD Using JDBC** [orig. Roll 20, Q2]
   Create a student database/table and implement INSERT, UPDATE, DELETE and SELECT operations using JDBC Statement.
   - File: `StudentCRUD.java`

3. **PreparedStatement for Parameterized Operations** [orig. Roll 20, Q3]
   Develop a student registration program using PreparedStatement to insert and search student records based on user input.
   - File: `StudentRegistration.java`

4. **CallableStatement & Stored Procedures** [orig. Roll 20, Q4]
   Create a MySQL stored procedure and invoke it from Java using CallableStatement.
   - File: `CallableStatementDemo.java`

5. **ResultSet Navigation** [orig. Roll 21, Q1]
   Retrieve employee/student records and demonstrate ResultSet navigation methods such as next(), previous(), first(), last() and absolute().
   - File: `ResultSetNavigation.java`

6. **BLOB and CLOB Handling** [orig. Roll 21, Q2]
   Store and retrieve an image using BLOB and a large text/document using CLOB.
   - File: `BlobClobDemo.java`

7. **Database Metadata** [orig. Roll 21, Q3]
   Write a program to display database information such as database name, version, driver name, supported features and available tables using DatabaseMetaData.
   - File: `DatabaseMetadataDemo.java`

8. **ResultSet Metadata** [orig. Roll 22, Q1]
   Display the column names, column count, data types and other properties of a table dynamically using ResultSetMetaData.
   - File: `ResultSetMetadataDemo.java`

9. **JDBC Transactions** [orig. Roll 22, Q2]
   Implement a bank money-transfer system using JDBC transactions. Use commit() when successful and rollback() when an error occurs.
   - File: `BankTransaction.java`

10. **JDBC Exception & Error Handling** [orig. Roll 22, Q3]
    Develop a JDBC application that handles connection errors, invalid SQL queries, duplicate records and invalid input using appropriate exception handling.
    - File: `JDBCExceptionHandling.java`

---

## Database Schema & Stored Procedure Setup
All database setup queries, tables, and stored procedures are in the file:
- `studentdb`