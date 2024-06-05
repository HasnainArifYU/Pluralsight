USE northwind;

/*
1. products
*/

/*
2. select ProductID, ProductName, UnitPrice from products;
*/

/*
 3. select ProductID, ProductName, UnitPrice from products
 order by UnitPrice;
 */
 
 /*
 select * from products where UnitPrice<=7.5;
 */
 
 /*
SELECT * FROM Products WHERE UnitsInStock >= 100 ORDER BY UnitPrice DESC;
*/

/*
SELECT * FROM Products WHERE UnitsInStock >= 100 ORDER BY UnitPrice DESC, ProductName ASC;


/*
SELECT * FROM Products WHERE UnitsInStock = 0 AND UnitsOnOrder > 0 ORDER BY ProductName ASC;
*/

/*
The table name is Categories.
*/
/*
SELECT * FROM Categories;
\SELECT CategoryID FROM Categories WHERE CategoryName = 'Seafood';
*/

/*
SELECT * FROM Products WHERE CategoryID = (SELECT CategoryID FROM Categories WHERE CategoryName = 'Seafood');
*/

/*
SELECT * FROM Products WHERE CategoryID = (SELECT CategoryID FROM Categories WHERE CategoryName = 'Seafood');
*/
/*
SELECT * FROM Products WHERE CategoryID = (SELECT CategoryID FROM Categories WHERE CategoryName = 'Seafood');
*/
/*
SELECT FirstName, LastName FROM Employees;
/*
/*
SELECT * FROM Employees WHERE Title LIKE '%manager%';
*/
/*
SELECT DISTINCT Title FROM Employees;
*/



