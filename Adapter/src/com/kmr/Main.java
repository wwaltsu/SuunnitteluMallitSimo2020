package com.kmr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VegePizza tofupizza = new VegePizza();
        AlBacon pekonipizza = new AlBacon();
        Pizza pizzaAdapter = new VegePizzaAdapter(tofupizza);

        pekonipizza.addCheese();
        pekonipizza.addEgg();
        pekonipizza.addMeat();
        System.out.println("***********************************************");
        System.out.println("                    Adapteri");
        System.out.println("***********************************************");
        pizzaAdapter.addCheese();
        pizzaAdapter.addEgg();
        pizzaAdapter.addMeat();
    }
}
