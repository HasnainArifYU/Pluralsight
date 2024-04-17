package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDate;

public class TheatreReservations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your Full Name : ");
        String fullName = s.nextLine();

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
                lastName = fullName.substring(firstSpaceIndex + 1);  // If there is only one space, extract last name
            }
        } else {
            firstName = fullName;  // If no spaces, assume the whole name is the first name
        }

        System.out.println("What date will you be coming (MM/dd/yyyy : ");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateInput = s.nextLine();
        LocalDate date = LocalDate.parse(dateInput, dateFormatter); // This can throw DateTimeParseException
        //System.out.println("Date entered: " + date);
        int numberOfTickets;
        System.out.println("How many tickets would u like?");
        numberOfTickets = s.nextInt();
        if (numberOfTickets>1) {
            System.out.println(numberOfTickets + " tickets reserved for " + date + " under " +lastName+", "+firstName);
        }
        else {
            System.out.println(numberOfTickets + " ticket reserved for " + date + " under " +lastName+", "+firstName);



        }


    }

}
