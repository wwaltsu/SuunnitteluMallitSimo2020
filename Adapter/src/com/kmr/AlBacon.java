package com.kmr;

public class AlBacon implements Pizza {
    @Override
    public void addMeat() {
        System.out.println("Lisätään pekoni");
    }

    @Override
    public void addCheese() {
        System.out.println("Lisätään pizzajuustoa");

    }

    @Override
    public void addEgg() {
        System.out.println("Lisätään kananmunan viipalaleita.");

    }
}
