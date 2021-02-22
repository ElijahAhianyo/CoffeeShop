package com.coffeeshop;

public class SoyDecorator extends CondimentDecorator{
    private double soyCost = 0.80;

    public SoyDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "|soy ";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + soyCost;
    }
}
