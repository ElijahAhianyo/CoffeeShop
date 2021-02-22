package com.coffeeshop;

public class MochaDecorator extends CondimentDecorator {
    private double mochaPrice = 0.90;
    public MochaDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "|mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + mochaPrice;
    }
}
