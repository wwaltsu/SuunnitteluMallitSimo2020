package com.visitor;
public class FinalGymBattle implements PokemonLevel {
    private static FinalGymBattle instance = new FinalGymBattle();
    private FinalGymBattle() {}

    public static FinalGymBattle instance() {
        return instance;
    }

    public void updateState(Pokemon pokemon)
    {
        System.out.println("You face the final gym owner now and your opponent is strong, but you still manage.");
        pokemon.setCurrentState(Charizard.instance());
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public double bonusPoints() {
        return 0;
    }
}