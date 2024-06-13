package com.pluralsight.main;
import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

import com.pluralsight.manager.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;


import org.apache.commons.dbcp2.BasicDataSource;

public class NorthwindShippers
    {
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println(
                        "Application needs two arguments to run: " +
                                "java com.hca.jdbc.UsingDriverManager <username> <password>");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            Scanner scanner = new Scanner(System.in);
            DataManager dataManager = new DataManager(dataSource);

            try {
                // 1. Prompt the user for new shipper data and insert it
                System.out.println("Enter new shipper name:");
                String name = scanner.nextLine();
                System.out.println("Enter new shipper phone:");
                String phone = scanner.nextLine();
                int newShipperId = dataManager.insertShipper(name, phone);
                System.out.println("New shipper ID: " + newShipperId);

                // 2. Run a query and display all the shippers
                dataManager.displayAllShippers();

                // 3. Prompt the user to change the phone number of a shipper
                System.out.println("Enter the ID of the shipper to update:");
                int idToUpdate = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.println("Enter the new phone number:");
                String newPhone = scanner.nextLine();
                dataManager.updateShipperPhone(idToUpdate, newPhone);

                // 4. Run a query and display all the shippers
                dataManager.displayAllShippers();

                // 5. Prompt the user to delete a shipper
                System.out.println("Enter the ID of the shipper to delete:");
                int idToDelete = scanner.nextInt();
                dataManager.deleteShipper(idToDelete);

                // 6. Run a query and display all the shippers
                dataManager.displayAllShippers();

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                scanner.close();
            }
        }
    }










        }

}
