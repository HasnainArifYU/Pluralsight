package com.pluralsight;
import java.sql.*;
public class NP {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection;
        connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/", "root", "admin");

        Statement statement = connection.createStatement();

        String query = "SELECT ProductName FROM northwind.products;";

        ResultSet results = statement.executeQuery(query);

        while (results.next()) {
            String resultsString = results.getString("ProductName");
            System.out.println(resultsString);
        }


        connection.close();

    }
}
