package com.pluralsight;


import java.util.Scanner;
import java.util.SimpleTimeZone;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your First Name : ");
        String FirstName = s.nextLine().trim();



        System.out.println("Now please enter you middle name, or press enter to skip: ");
        String MiddleName = s.nextLine().trim();
        if (!MiddleName.isEmpty()){
            MiddleName=MiddleName.charAt(0)+"";
        }


        System.out.println("Please enter your Last name:  ");
        String LastName = s.nextLine().trim();
        LastName = LastName + ", ";


        System.out.println("Please enter your Suffix, if you have one ");
        String Suffix = s.nextLine().trim();


        StringBuilder last = null;
        if (Suffix.isEmpty() || Suffix == null) {
            last = new StringBuilder(LastName);
            last.deleteCharAt(last.indexOf(","));
        }

        System.out.println(" First Name: " + FirstName);
        System.out.println(" Middle Name: " + MiddleName);
        System.out.println(" Last Name: " + last);
        System.out.println(" Suffix: " + Suffix);


        System.out.println("Your Full Name is : " + FirstName + " " + MiddleName + " " + last + " " + Suffix);

    }
}
