package com.pluralsight;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the file to open : ");
            String filePath = scanner.nextLine();
            System.out.println("Enter a file to create : ");
            String File2 = scanner.nextLine();
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            FileWriter FW = new FileWriter(File2, true);
            BufferedWriter bufwriter = new BufferedWriter(FW);




            String input;


            String[] splitter;
            while ((input = reader.readLine()) != null) {
                splitter = input.split("\\|");
                int id = Integer.parseInt(splitter[0]);
                String name = splitter[1];
                double HouseWorked = Double.parseDouble(splitter[2]);
                double payRate = Double.parseDouble(splitter[3]);

                Emplyee employee = new Emplyee(id, name, HouseWorked, payRate);
                System.out.println(" "+ employee.getEmployeeId() + "" + employee.getName()+""+ employee.getGrossPay());
                //String Line = employee.getEmployeeId() + " | " + employee.getName() + " | " + employee.getGrossPay() + " \n";
                //Bufwriter.write(Line);
                //Bufwriter.newLine();

                String formattedLine = String.format("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
                bufwriter.write(formattedLine);
            }                bufwriter.close();
            bufwriter.close();

        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
