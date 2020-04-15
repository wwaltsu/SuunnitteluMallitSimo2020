package com.visitor;
public class Charizard implements PokemonLevel {
    static Charizard instance = new Charizard();
    Charizard() {}
    public static Charizard instance() {
        return instance;
    }
    public void updateState(Pokemon pokemon)
    {
        pokemon.setPokemonState("charizard");
        System.out.println("Final evolution Charizard STATS=" + " level=" + pokemon.getLvl()+ " hp=" + pokemon.getHp()+ " exp=" +pokemon.getExp());
    }

    @Override
    public void accept(Visitor visitor) {
        bonusPoints();
        visitor.visit(this);
    }

    @Override
    public double bonusPoints() {
        return 333.333;
    }
}