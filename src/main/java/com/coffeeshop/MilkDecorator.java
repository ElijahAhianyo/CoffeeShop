package com.coffeeshop;

public class MilkDecorator extends CondimentDecorator{
    private double milkPrice = 0.50;
    public MilkDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " |milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + milkPrice;
    }
}
