package com.kmr;

public class VegePizzaAdapter implements Pizza {
    VegePizza vegePizzat;

    public VegePizzaAdapter(VegePizza vegePizza) { vegePizzat = vegePizza; }

    @Override
    public void addMeat() { vegePizzat.addTofu(); }

    @Override
    public void addCheese() { vegePizzat.addVegeCheese(); }

    @Override
    public void addEgg() { vegePizzat.addVeggie(); }
}
