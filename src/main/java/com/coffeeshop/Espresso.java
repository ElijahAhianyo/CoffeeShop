package com.coffeeshop;

public class Espresso extends Beverage {
    private String description = "Espresso";

    public String getDescription(){
        return description;
    }

    @Override
    public double cost() {
        return 8.50;
    }
}
