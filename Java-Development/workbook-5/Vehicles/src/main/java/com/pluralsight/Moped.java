package com.pluralsight;

public class Moped extends Vehicles {

    private int maxWeight;

    public Moped(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int maxWeight) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.maxWeight = maxWeight;
    }

    public void ride() {

    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
