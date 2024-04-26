package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();



        /*System.out.print("What is the serial number? ");
        phone.setSerialNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        phone.setModelName(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(scanner.nextLine());

        // Using the getters, print the properties of the phone
        display(phone);

        CellPhone cellPhone2=new CellPhone();*/




        /*System.out.print("What is the serial number? ");
        cellPhone2.setSerialNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone2.setModelName(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone2.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone2.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone2.setOwner(scanner.nextLine());*/


        //display(cellPhone2);


        //phone.dial(cellPhone2.getPhoneNumber());
        //cellPhone2.dial(phone.getPhoneNumber());

        /*System.out.print("What is the serial number? ");
        cellPhone2.setSerialNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone2.setModelName(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone2.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone2.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone2.setOwner(scanner.nextLine());*/

        System.out.print("What is the serial number? ");
        long serial = scanner.nextLong();
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        String modelName = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String Carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String PhoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        CellPhone cellPhone3 = new CellPhone(serial, modelName, Carrier, PhoneNumber, owner);
        display(cellPhone3);


    }
    public static void display(CellPhone phone){
        System.out.println("\nCell Phone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModelName());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
        System.out.println(" ");
    }


};
