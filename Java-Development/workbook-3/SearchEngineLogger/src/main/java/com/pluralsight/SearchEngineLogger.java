package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class SearchEngineLogger {
    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);
            FileWriter writer = new FileWriter("Logs.txt");
            BufferedWriter buff = new BufferedWriter(writer);

            LocalDateTime time = LocalDateTime.now();
            DateTimeFormatter formatt = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
            buff.write(time.format(formatt)+" User launched the application. \n");




            while (true) {

                System.out.println("Enter a search term (X to exit) ");

                String search = s.nextLine();

                if (search.equalsIgnoreCase("x")) {
                    buff.write(time.format(formatt)+" User Exited the application.");
                    break;
                }
                else if (!search.isEmpty()) {
                        buff.write(time.format(formatt)+" User made a search. \n");
                }
            }
            buff.close();
            s.close();

        } catch(Exception e) {

        }
    }
}
