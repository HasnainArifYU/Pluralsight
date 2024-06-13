package com.pluralsight;

import java.sql.*;

public class northwind {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            if (args.length != 2) {
                System.out.println("This application needs a Username and a Password to run");
                return;
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password
            );

            String query = """
                    SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                    FROM products;
                    """;

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet results = preparedStatement.executeQuery();

            while (results.next()) {
                String productName = results.getString("ProductName");
                int productId = results.getInt("ProductID");
                double unitPrice = results.getDouble("UnitPrice");
                int unitsInStock = results.getInt("UnitsInStock");

                System.out.println("ProductID: " + productId);
                System.out.println("ProductName: " + productName);
                System.out.println("UnitPrice: " + unitPrice);
                System.out.println("UnitsInStock: " + unitsInStock);
                System.out.println("==============================================");
            }

            results.close();
            preparedStatement.close();
            connection.close();

        } catch (Exception ex) {
            System.out.println("An error has occurred");
            ex.printStackTrace();
        }
    }
}
