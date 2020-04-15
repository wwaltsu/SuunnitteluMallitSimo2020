package com.visitor;
public class Charmeleon implements PokemonLevel
{
    static Charmeleon instance = new Charmeleon();
    Charmeleon() {}
    public static Charmeleon instance() {
        return instance;
    }
    public void updateState(Pokemon pokemon)
    {
        pokemon.setPokemonState("charmeleon");
        pokemon.setCurrentState(FinalGymBattle.instance());

    }
    @Override
    public double bonusPoints() {
        return 222.222;
    }

    @Override
    public void accept(Visitor visitor) {
        bonusPoints();
        visitor.visit(this);

    }


}