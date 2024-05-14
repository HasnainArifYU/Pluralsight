package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("honda", "civic.", 1, 1, 1, 1, 1);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.getColor());
        SemiTruck semi = new SemiTruck("Cascadia", "black", 200, 10, 2, 50000, 1);
        Hovercraft hov = new Hovercraft("neoteric recreational", "blue", 500, 5000, 50, 500, 444444);
        System.out.println(semi.getCargoCapacity());
        System.out.println(hov.getAirCushionPressure());





    }
}
