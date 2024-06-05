use northwind;
/*
select Count(*)
from suppliers;
*/


/*
select  SUM(Salary) 
from Employees;
*/

/*
select MIN(UnitPrice)
from Products;
*/

/*
select AVG(UnitPrice) 
from Products;
*/

/*
select MAX(UnitPrice) 
from Products;
*/
/*
select SupplierID, Count(ProductName) From products
group by SupplierID;
*/
/*
select CategoryID, AVG(UnitPrice) From products
group by CategoryID;
*/
/*
select SupplierID, Count(*) as NumberofP From products
group by SupplierID
having NumberofP>=5;
*/
/*
select productid, productname, (UnitsInStock * UnitPrice) as InventoryValue
from products
order by InventoryValue DESC;
*/
