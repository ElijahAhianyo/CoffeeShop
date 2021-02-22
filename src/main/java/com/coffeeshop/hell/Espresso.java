package com.coffeeshop.hell;

public class Espresso extends Beverage {
    private String description = "Espresso";
    private double espressoPrice = 8.50;

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public double cost() {
        return super.cost() + espressoPrice;
    }
}
