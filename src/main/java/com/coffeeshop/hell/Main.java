package com.coffeeshop.hell;

public class Main {
    public static void main(String [] args){
        Espresso espresso = new Espresso();
        espresso.setMilk(true);
        espresso.setWhip(true);
        System.out.println(espresso.getDescription() + ". cost: GHC "+ espresso.cost());
    }
}
