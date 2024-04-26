package com.pluralsight;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

    public class StoreApp {
        public static void main(String[] args) {
            ArrayList<product> inventory = getInventory();

            System.out.println("We carry the following inventory:");
            for (product p : inventory) {
                System.out.printf("ID: %d, %s - Price: $%.2f\n", p.getId(), p.getName(), p.getPrice());
            }
        }

        public static ArrayList<product> getInventory() {
            ArrayList<product> inventory = new ArrayList<>();
            String fileName = "inventory.csv";

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split("\\|");
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    float price = Float.parseFloat(data[2].trim());
                    inventory.add(new product(id, name, price));
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: File not found '" + fileName + "'");
            } catch (IOException e) {
                System.out.println("Error reading the file '" + fileName + "'");
            }

            return inventory;
        }
    }

