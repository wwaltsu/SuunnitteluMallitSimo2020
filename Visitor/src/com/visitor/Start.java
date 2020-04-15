package com.visitor;
public class Start implements PokemonLevel {

    private static Start instance = new Start();
    private Start() {}

    public static Start instance() {
        return instance;
    }

    public void updateState(Pokemon pokemon)
    {
        pokemon.setPokemonState("start");
        System.out.println("Charmander is given to you! STATS=" + " level=" + pokemon.getLvl()+ " hp=" + pokemon.getHp()+ " exp=" +pokemon.getExp());
        pokemon.setCurrentState(Walking.instance());
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public double bonusPoints() {
        return 0;
    }
}