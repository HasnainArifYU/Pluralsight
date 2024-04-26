package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

    public class SearchInventory {
        public static void main(String[] args) {
            ArrayList<product> inventory = getInventory();

            // Displaying the inventory
            System.out.println("Inventory:");
            for (product product : inventory) {
                System.out.printf("ID: %d, Name: %s, Price: $%.2f\n", product.getId(), product.getName(), product.getPrice());
            }
        }

        private static ArrayList<product> getInventory() {
            // Creating an ArrayList to store the inventory of products
            ArrayList<product> inventory = new ArrayList<>();

            // Adding initial products to the inventory
            inventory.add(new product(1, "Hammer", 15.75f));
            inventory.add(new product(2, "Screwdriver", 7.50f));
            inventory.add(new product(3, "Wrench", 8.25f));
            inventory.add(new product(4, "Pliers", 9.70f));
            inventory.add(new product(5, "Tape Measure", 4.65f));

            // More products can be added as needed
            return inventory;
        }
    }

