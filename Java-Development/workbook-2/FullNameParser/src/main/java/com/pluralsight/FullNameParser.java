package com.pluralsight;


import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        System.out.println("Please Enter Full Name, middle name is optional :");
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        String[] parts = fullName.split(" ");

        // Assuming the first part is always the first name
        String firstName = parts[0];

        String middleName = "";
        String lastName = "";

        // Check the number of parts to handle middle and last name
        if (parts.length == 3) {
            middleName = parts[1];  // Second part is the middle name
            lastName = parts[2];   // Third part is the last name
        } else if (parts.length == 2) {
            lastName = parts[1];
            middleName = "(none)";// If there are only two parts, assume the second part is the last name
        }

        // Output the names
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }
}
