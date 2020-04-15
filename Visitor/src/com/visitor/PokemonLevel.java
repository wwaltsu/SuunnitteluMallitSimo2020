package com.visitor;
public interface  PokemonLevel
{
    public void updateState(Pokemon pokemon);
    void accept (Visitor visitor);
    public double bonusPoints();

}