package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        double bobSalary = 15.5;
        double garySalary= 25.5;
        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);
        // question 2

        double carPrice = 11000.1;
        double truckPrice= 22000.2;
        double lowestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The lowest salary is " + lowestPrice);

        //question 3

        double radius = 7.25;
        double area = Math.PI*Math.pow(radius, 2);

        System.out.println("the area is " + area);

        //q4

        double var =5.0;
        double sqroot = Math.sqrt(var);

        System.out.println("the square root is " + sqroot);





    }
}
