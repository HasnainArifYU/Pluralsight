package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    // Map product names to Product objects
    public static HashMap<String, Product> inventory = new HashMap<>();

    public static void main(String[] args) {
        try {
            loadInventory(); // Load inventory from file
        } catch (FileNotFoundException e) {
            System.out.println("Inventory file not found.");
            return; // Exit if no inventory file is found
        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("What product are you interested in? ");
            String productName = scanner.nextLine().trim();  // Read product name from user input
            Product matchedProduct = inventory.get(productName); // Retrieve the product by name from the HashMap
            if (matchedProduct == null) {
                System.out.println("We don't carry that product."); // Product not found
            } else {
                System.out.printf("We carry %s and the price is $%.2f\n",
                        matchedProduct.getName(), matchedProduct.getPrice()); // Display product details
            }
        } finally {
            scanner.close(); // Always close the scanner
        }
    }

    public static void loadInventory() throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("Inventory.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                float price = Float.parseFloat(data[2].trim());
                Product product = new Product(id, name, price);
                inventory.put(name, product);  // Store the product in the HashMap using its name as the key
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            throw new RuntimeException("Error processing the inventory file.", e);
        }
    }
}
