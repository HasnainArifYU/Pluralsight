package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        try {

            Scanner s = new Scanner(System.in);
            String q;


            String[] quotes = {
                    "The only way to do great work is to love what you do. - Steve Jobs",
                    "It does not matter how slowly you go as long as you do not stop. - Confucius",
                    "Everything you can imagine is real. - Pablo Picasso",
                    "What we think, we become. - Buddha",
                    "All limitations are self-imposed. - Oliver Wendell Holmes",
                    "Tough times never last but tough people do. - Robert H. Schuller",
                    "Problems are not stop signs, they are guidelines. - Robert H. Schuller",
                    "One day the people that don’t even believe in you will tell everyone how they met you. - Johnny Depp",
                    "If I’m gonna tell a real story, I’m gonna start with my name. - Kendrick Lamar",
                    "Have enough courage to start and enough heart to finish. - Jessica N. S. Yourko"
            };


            System.out.println("please enter a quote number: ");
            int a = s.nextInt();
            System.out.println(quotes[a - 1]);
        } catch (Exception ex) {
            System.out.println("Number is out of range");
        }
    }
}


