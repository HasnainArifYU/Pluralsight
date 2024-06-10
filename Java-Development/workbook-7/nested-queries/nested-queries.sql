use northwind;

select ProductName from products where UnitPrice = (select max(unitPrice) from products);



SELECT orderid, shipname, shipaddress from orders where shipperID = (SELECT ShipperID from Shippers where CompanyName = 'Federal Shipping');

SELECT FIRSTname, LastName, employeeID from employees where employeeID = (select EmployeeID FROM ORDERS WHERE ORDERID = 10266);

select COMPANYNAME, CONTACTNAME, CUSTOMERid FROM CUSTOMERS WHERE CUSTOMERid = (SELECT CUSTOMERID FROM ORDERS WHERE ORDERID = 10266);