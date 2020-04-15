package com.visitor;
public class Pokemon {
    private PokemonLevel currentState;
    private int exp;
    private int hp;
    private int lvl;
    private String pokemonState;

    public int getExp() {
        if (pokemonState == "charmander") {
            exp = 0;
        } else if (pokemonState == "charmeleon") {
            exp = 400;
        } else if (pokemonState == "charizard") {
            exp = 1100;
        }
        return exp;
    }

    public int getHp() {
        if (pokemonState == "charmander") {
            hp = 12;
        } else if (pokemonState == "charmeleon") {
            hp = 45;
        } else if(pokemonState=="charizard")
            hp = 70;
        return hp;
    }
    public int getLvl() {
        if (pokemonState == "charmander") {
            return lvl = 1;
        } else if(pokemonState== "charmeleon") {
            return lvl = 40;
        } else if(pokemonState == "charizard") {
            return lvl = 65;
        }
        return lvl;
    }
    public void setPokemonState(String pokemonState) {
        this.pokemonState = pokemonState;
    }

    public Pokemon(PokemonLevel currentState,int exp, int hp, int lvl, String kouluttaja)
    {
        super();
        this.currentState = currentState;
        this.exp = exp;
        this.hp = hp;
        this.lvl = lvl;
        this.pokemonState = kouluttaja;

        if(currentState == null) {
            this.currentState = Start.instance();
        }
    }
    public void setCurrentState(PokemonLevel currentState) {
        this.currentState = currentState;
    }

    public void train() {
        currentState.updateState(this);
    }

    public void accept(Visitor visitor) {
        currentState.accept(visitor);
    }
}