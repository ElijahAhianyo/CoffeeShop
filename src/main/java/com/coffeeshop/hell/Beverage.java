package com.coffeeshop.hell;

public class Beverage {
    String description = "unknown Beverage";
    private boolean milk, whip = false;
    private double milkPrice = 0.60;
    private double whipPrice = 0.70;
    private double cost = 0.0;

    public String getDescription(){
        return this.description;
    }

    public double cost(){
        if (milk && !whip)
            return cost + milkPrice;
        else if(!milk && whip)
            return cost + whipPrice;
        else if(milk && whip)
            return cost + milkPrice + whipPrice;
        else return cost;
    }

    public void setMilkPrice(double milkPrice){
        this.milkPrice = milkPrice;
    }

    public void setWhipPrice(double whipPrice) {
        this.whipPrice = whipPrice;
    }


    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

}
