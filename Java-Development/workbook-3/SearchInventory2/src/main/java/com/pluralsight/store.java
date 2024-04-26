package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
public class store {
    public static void main(String[] args) {
        ArrayList<product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<product> getInventory() {
        ArrayList<product> inventory = new ArrayList<product>();
        // this method loads product objects into inventory
        // and its details are not shown
        return inventory;
    }
}