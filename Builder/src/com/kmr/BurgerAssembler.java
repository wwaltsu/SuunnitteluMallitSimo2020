package com.kmr;

public class BurgerAssembler {
    private IHamburgerBuilder IHamburgerBuilder;
    public BurgerAssembler(IHamburgerBuilder IHamburgerBuilder){ this.IHamburgerBuilder = IHamburgerBuilder;
    }
    public Object getHampurilainen() {
        return  this.IHamburgerBuilder.getHampurilainen();
    }
    public void teeHampurilainen() {
        this.IHamburgerBuilder.buildCompanyName();
        this.IHamburgerBuilder.buildSampyla();
        this.IHamburgerBuilder.buildLiha();
        this.IHamburgerBuilder.buildJuusto();
        this.IHamburgerBuilder.buildSalaatti();
    }
}
