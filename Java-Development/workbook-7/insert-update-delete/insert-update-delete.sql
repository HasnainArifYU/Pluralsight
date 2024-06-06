/*
1.
INSERT INTO Suppliers (CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax, HomePage)
VALUES ('New Supplier Company', 'John Doe', 'Sales Manager', '123 New St', 'New City', 'Region', '12345', 'Country', '123-456-7890', '123-456-7891', 'http://www.newsupplier.com');
*/

/*
2.
INSERT INTO Products (ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)
VALUES ('New Product', 30, 1, '10 boxes x 20 bags', 20.00, 50, 0, 10, 0);
*/

/*
3.
SELECT 
    p.ProductID, 
    p.ProductName, 
    p.UnitPrice, 
    s.CompanyName AS SupplierName
FROM 
    Products p
JOIN 
    Suppliers s ON p.SupplierID = s.SupplierID;

*/

/*
4.
UPDATE Products
SET UnitPrice = UnitPrice * 1.15
WHERE ProductName = 'New Product';

*/


/*
5.
SELECT 
    p.ProductID, 
    p.ProductName, 
    p.UnitPrice
FROM 
    Products p
WHERE 
    p.SupplierID = 30;

*/

/*
6.
DELETE FROM Products
WHERE ProductName = 'New Product';
*/

/*
7.
DELETE FROM Suppliers
WHERE SupplierID = 30;

*/

/*
8.
SELECT 
    p.ProductID, 
    p.ProductName, 
    p.UnitPrice, 
    c.CategoryName, 
    s.CompanyName AS SupplierName
FROM 
    Products p
LEFT JOIN 
    Categories c ON p.CategoryID = c.CategoryID
LEFT JOIN 
    Suppliers s ON p.SupplierID = s.SupplierID
ORDER BY 
    p.ProductName;

*/

/*
9.
SELECT 
    SupplierID, 
    CompanyName, 
    ContactName, 
    ContactTitle, 
    Country, 
    Phone
FROM 
    Suppliers
ORDER BY 
    CompanyName;

*/


