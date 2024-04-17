package com.pluralsight;


import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.println("Please provide the following information:");

        // Full name
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        // Billing address
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Shipping address
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        // Building the addresses using StringBuilder
        StringBuilder addressBuilder = new StringBuilder();

        addressBuilder.append(fullName).append("\n");
        addressBuilder.append("\n");
        addressBuilder.append("Billing Address:\n");
        addressBuilder.append(billingStreet).append("\n");
        addressBuilder.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");
        addressBuilder.append("\n");
        addressBuilder.append("Shipping Address:\n");
        addressBuilder.append(shippingStreet).append("\n");
        addressBuilder.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        String FinalString = addressBuilder.toString();
        // Displaying the customer information
        System.out.println(FinalString);

        // Closing the scanner
        scanner.close();
    }
}
