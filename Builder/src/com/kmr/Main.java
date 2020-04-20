package com.kmr;

public class Main {

    public static void main(String[] args) {
        IHamburgerBuilder mcDonalds = new McDonalds();
        IHamburgerBuilder hesburger = new Hesburger();
        BurgerAssembler burgerAssembler1 = new BurgerAssembler(mcDonalds);
        BurgerAssembler burgerAssembler2 = new BurgerAssembler(hesburger);
        burgerAssembler1.teeHampurilainen();
        burgerAssembler2.teeHampurilainen();
        Object mcdonaldsHampurilainen = burgerAssembler1.getHampurilainen();
        Object hesburgerHampurilainen = burgerAssembler2.getHampurilainen();
        System.out.println(mcdonaldsHampurilainen);
        System.out.println(hesburgerHampurilainen);
    }
}


