package com.visitor;

public class Charmander implements PokemonLevel {
    static Charmander instance = new Charmander();
    Charmander() {}
    public static Charmander instance() {
        return instance;
    }
    public void updateState(Pokemon pokemon)
    {
        System.out.println("Your and Charmander road begins, Charmander is level 1 now and has 12hp");
        pokemon.setCurrentState(Walking.instance());
    }


    @Override
    public void accept(Visitor visitor) {
        bonusPoints();
        visitor.visit(this);
    }

    @Override
    public double bonusPoints() {
        return 111.111;
    }
}