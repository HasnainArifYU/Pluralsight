package com.pluralsight;

import java.util.Scanner;

public class FullNameParser2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter full name, middle name is optional");
        // Example full name
        String fullName = s.nextLine();

        // Initialize variables for first, middle, and last names
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // Find the index of the first space
        int firstSpaceIndex = fullName.indexOf(' ');
        // Find the index of the last space
        int lastSpaceIndex = fullName.lastIndexOf(' ');

        // Check if there is at least one space
        if (firstSpaceIndex != -1) {
            firstName = fullName.substring(0, firstSpaceIndex);  // Extract first name

            // Check if there is more than one space
            if (firstSpaceIndex != lastSpaceIndex) {
                middleName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);  // Extract middle name
                lastName = fullName.substring(lastSpaceIndex + 1);  // Extract last name
            } else {
                lastName = fullName.substring(firstSpaceIndex + 1);
                middleName="(none)"; // If there is only one space, extract last name
            }
        } else {
            firstName = fullName;  // If no spaces, assume the whole name is the first name
        }

        // Output the names
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }
}
