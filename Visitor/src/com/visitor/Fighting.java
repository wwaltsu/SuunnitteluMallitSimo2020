package com.visitor;
public class Fighting implements PokemonLevel {
    private static Fighting instance = new Fighting();
    private Fighting() {}
    public static Fighting instance() {
        return instance;
    }
    public void updateState(Pokemon pokemon)
    {
        pokemon.setPokemonState("charmeleon");
        System.out.println("Pokemon won and gained exp, pokemon is now evolved " + " lvl=" + pokemon.getLvl()+ " hp=" + pokemon.getHp()+ " exp=" +pokemon.getExp() );
        pokemon.setCurrentState(Charmeleon.instance());
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public double bonusPoints() {
        return 0;
    }
}