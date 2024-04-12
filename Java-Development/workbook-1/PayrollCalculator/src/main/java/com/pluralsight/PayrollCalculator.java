package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        String name = s.nextLine();

        System.out.println("Please Enter Your Hours : ");
        float hours = s.nextFloat();

        System.out.println("Please add your pay rate : ");
        float PayRate = s.nextFloat();

        float pay = hours*PayRate;

        System.out.println("Your name is " + name + " and your gross pay is " + pay);
    }
}
