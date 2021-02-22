package com.coffeeshop;

public class WhipDecorator extends CondimentDecorator{
    private double whipPrice = 0.50;

    public WhipDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "|whip ";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + whipPrice;
    }
}
