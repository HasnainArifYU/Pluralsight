package com.pluralsight;

public class product {
    private int id;
    private String name;
    private float price;

    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public float getPrice() {
        return this.price;
    }
}