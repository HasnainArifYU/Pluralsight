package com.pluralsight;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odo;

    public Vehicle(String makeModel, int year, double originalCost, String description, String dateAcquired) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odo = 0;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdo() {
        return odo;
    }

    public void setOdo(int odo) {
        this.odo = odo;
    }

    @Override
    public double getValue() {
        int currentYear = 2024;
        int carAge = currentYear - this.year;
        double depreciationRate = 0.0;
        double currentValue = getOriginalCost();

        if (carAge <= 3) {
            depreciationRate = 0.03;
        } else if (carAge <= 6) {
            depreciationRate = 0.06;
        } else if (carAge <= 10) {
            depreciationRate = 0.08;
        } else {
            currentValue = 1000;
        }

        if (carAge <= 10) {
            for (int i = 0; i < carAge; i++) {
                currentValue *= (1 - depreciationRate);
            }
        }

        if (odo > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            currentValue *= 0.75;
        }

        return currentValue;
    }
}
