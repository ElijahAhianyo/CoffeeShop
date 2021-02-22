package com.coffeeshop;

public abstract class Beverage {
    private String description = "unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
