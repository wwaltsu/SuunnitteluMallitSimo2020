package com.visitor;
public class Walking implements PokemonLevel {
    private static Walking instance = new Walking();
    private Walking() {}
    public static Walking instance() {
        return instance;
    }
    public void updateState(Pokemon pokemon)
    {

        System.out.println("You and your pokemon are walking and meet an opponent.");
        pokemon.setCurrentState(Fighting.instance());
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public double bonusPoints() {
        return 0;
    }
}