package com.visitor;

public class BonusVisitor implements Visitor {
    @Override
    public void visit(Charmander charmander) {
        System.out.println("Charmander bonus = " + charmander.bonusPoints() + " points");
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        System.out.println("Charmeleon bonus = " + charmeleon.bonusPoints() + " points");
    }

    @Override
    public void visit(Charizard charizard) {
        System.out.println("Charizard bonus = " + charizard.bonusPoints()+ " points");
    }
}

