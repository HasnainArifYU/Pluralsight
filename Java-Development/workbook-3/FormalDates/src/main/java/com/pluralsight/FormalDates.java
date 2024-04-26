package com.pluralsight;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.*;


public class FormalDates {
    public static void main(String[] args) {

        LocalDateTime todayNow = LocalDateTime.now();
        DateTimeFormatter usFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter isoFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter monthDayYearFormat = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm z");


        System.out.println("MM/dd/yyyy: " + todayNow.format(usFormat));
        System.out.println("yyyy-MM-dd: " + todayNow.format(isoFormat));
        System.out.println("Month Name, Date, Year: " + todayNow.format(monthDayYearFormat));
        System.out.println("Sunday, Sep 5, 2021 10:02: " + gmtNow.format(fullFormat));
    }
}
