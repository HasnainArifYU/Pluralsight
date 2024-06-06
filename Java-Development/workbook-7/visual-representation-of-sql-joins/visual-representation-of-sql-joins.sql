USE northwind;
/*
SELECT 
p.ProductID,
p.ProductName,
p.UnitPrice,
c.CategoryName
FROM
Products p
INNER JOIN
Categories c ON p.CategoryID = c.CategoryID
ORDER BY
c.CategoryName,
p.ProductName;
*/

/*
SELECT
p.ProductID,
p.ProductName,
p.UnitPrice,
s.CompanyName
FROM 
Products p
INNER JOIN 
suppliers s on p.SupplierID = s.SupplierID
WHERE p.UnitPrice > 75
ORDER BY 
p.ProductName;
*/
/*
SELECT
p.ProductID,
p.ProductName,
p.UnitPrice,
s.CompanyName,
c.CategoryName
FROM
Products p
LEFT JOIN
suppliers s on p.SupplierID = s.SupplierID
LEFT JOIN 
categories c on p.SupplierID = c.CategoryID
ORDER BY 
p.ProductName;
*/

SELECT
p.ProductName,
c.CategoryName
FROM
products p
JOIN
categories c on p.SupplierID = c.CategoryID
JOIN
(
SELECT
max(UnitPrice) 
from
products) as Price
ORDER BY 
CategoryName;



