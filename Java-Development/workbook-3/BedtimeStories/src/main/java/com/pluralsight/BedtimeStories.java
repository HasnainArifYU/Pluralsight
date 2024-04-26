package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {

            Scanner a = new Scanner(System.in);
            System.out.println("Please Enter name of the file : ");
            String fileName = a.nextLine();
            FileInputStream file = new FileInputStream(fileName);
            Scanner s = new Scanner(file);


            String story;

            int i = 1;
            while (s.hasNextLine()) {
                story =i + ".  " + s.nextLine();
                System.out.println(story);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        }
}
