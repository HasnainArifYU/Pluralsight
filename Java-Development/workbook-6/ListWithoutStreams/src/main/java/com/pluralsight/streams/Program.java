package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Emma", "Johnson", 28));
        people.add(new Person("Liam", "Smith", 32));
        people.add(new Person("Olivia", "Brown", 25));
        people.add(new Person("Noah", "Williams", 30));
        people.add(new Person("Ava", "Jones", 27));
        people.add(new Person("Mason", "Garcia", 24));
        people.add(new Person("Sophia", "Martinez", 29));
        people.add(new Person("Ethan", "Rodriguez", 31));
        people.add(new Person("Isabella", "Davis", 26));
        people.add(new Person("James", "Hernandez", 33));



        displayMatch(people, "Rodriguez");
        calculateAverage(people);
    }

    public static void displayMatch(List<Person> people, String name) {
        for (Person person : people) {
            if (name.equalsIgnoreCase(person.getFirstName()) || name.equalsIgnoreCase(person.getLastName())) {
                System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
            }
        }
    }

    public static void calculateAverage(List<Person> people) {
        double numOfPpl = 0;
        double total = 0;
        int oldest = 0;
        int youngest = 150;
        for (Person person : people) {
            total += person.getAge();
            if (person.getAge()>oldest){
                oldest = person.getAge();
            } else if (person.getAge()<youngest) {
                youngest= person.getAge();

            }
            numOfPpl +=1;

        }
        System.out.println("Average age = " + total/numOfPpl);
        System.out.println("Oldest age = " + oldest);
        if (youngest!=150) {
            System.out.println("Youngest age = " +youngest);
        }

    }




}

