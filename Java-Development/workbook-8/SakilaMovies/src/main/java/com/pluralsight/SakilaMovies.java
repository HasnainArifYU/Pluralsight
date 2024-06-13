package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SakilaMovies {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the database username and password as program arguments.");
            return;
        }
        String username = args[0];
        String password = args[1];

        Scanner scanner = new Scanner(System.in);

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        boolean running = true;

        while (running) {
            System.out.print("Enter actor's last name (or type 'exit' to quit): ");
            String lastName = scanner.nextLine();
            if ("exit".equalsIgnoreCase(lastName)) {
                running = false;
                break;
            }

            listActorsByLastName(dataSource, lastName);

            System.out.print("Enter actor's first name (or type 'exit' to quit): ");
            String firstName = scanner.nextLine();
            if ("exit".equalsIgnoreCase(firstName)) {
                running = false;
                break;
            }

            listMoviesByActor(dataSource, firstName, lastName);
        }

        scanner.close();
    }

    private static void listActorsByLastName(DataSource dataSource, String lastName) {
        String sql = "SELECT actor_id, first_name, last_name FROM actor WHERE last_name = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, lastName);
            try (ResultSet rs = statement.executeQuery()) {
                if (!rs.next()) {
                    System.out.println("No actors found with the last name: " + lastName);
                } else {
                    do {
                        int actorId = rs.getInt("actor_id");
                        String firstName = rs.getString("first_name");
                        System.out.println(actorId + ": " + firstName + " " + lastName);
                    } while (rs.next());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void listMoviesByActor(DataSource dataSource, String firstName, String lastName) {
        String sql = "SELECT f.title FROM film f " +
                "JOIN film_actor fa ON f.film_id = fa.film_id " +
                "JOIN actor a ON fa.actor_id = a.actor_id " +
                "WHERE a.first_name = ? AND a.last_name = ?";
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {


            statement.setString(1, firstName);
            statement.setString(2, lastName);
            try (ResultSet rs = statement.executeQuery()) {
                if (!rs.next()) {
                    System.out.println("No movies found for actor: " + firstName + " " + lastName);
                } else {
                    do {
                        String movieTitle = rs.getString("title");
                        System.out.println(movieTitle);
                    } while (rs.next());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
