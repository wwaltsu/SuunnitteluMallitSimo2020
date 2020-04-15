package com.visitor;
public class Main
{
    public static void main(String[] args)
    {
        BonusVisitor bonusVisitor = new BonusVisitor();
        Charmander charmander = new Charmander();
        Charmeleon charmeleon = new Charmeleon();
        Charizard charizard = new Charizard();
        charmander.accept(bonusVisitor);
        charmeleon.accept(bonusVisitor);
        charizard.accept(bonusVisitor);

        Pokemon pokemon = new Pokemon(null,1,12,1 ,"kouluttaja");
        for(int i=0; i<6; i++) { pokemon.train(); }
    }




}