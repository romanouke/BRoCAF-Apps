package com.example.BRoCAF;

public class FoodItem {
    private String name;
    private double price;

    public FoodItem() {

    }

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
