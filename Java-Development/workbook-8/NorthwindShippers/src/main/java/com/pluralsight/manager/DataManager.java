package com.pluralsight.manager;


;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    // Constructor that receives a DataSource
    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int insertShipper(String name, String phone) throws SQLException {
        int id = 0;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(
                             "INSERT INTO shippers (CompanyName, Phone) VALUES(? , ?)");

        ) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, phone);

            // execute the query
            // confirm the update
            try (ResultSet keys = preparedStatement.getGeneratedKeys()) {
                while (keys.next()) {
                    id = keys.getInt(1);
                }
            }

        }
        return id;
    }
     public void displayAllShippers() throws SQLException {
         String query = "SELECT CompanyName, Phone FROM SHIPPERS";
         try (Connection connection = dataSource.getConnection();
              PreparedStatement preparedStatement =
                      connection.prepareStatement(query);
              ResultSet rs = preparedStatement.executeQuery(query);

         ) {
             while (rs.next()) {
                 System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Phone: " + rs.getString("phone"));


             }
         }
     }

    // Method to fetch actor by ID

}


