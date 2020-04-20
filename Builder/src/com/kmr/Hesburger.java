package com.kmr;

public class Hesburger implements IHamburgerBuilder {

    protected StringBuilder hampurilainen;
    public Hesburger() {
        this.hampurilainen = new StringBuilder();
    }
    @Override
    public void buildCompanyName() {
        hampurilainen.append("Hesburger, ");
    }
    public void buildSampyla() {
        hampurilainen.append("Sämpylä, ");
    }
    public void buildLiha() {
        hampurilainen.append("Naudanlihapihvi, ");
    }
    public void buildJuusto() {
        hampurilainen.append("Mauste juustoa, ");
    }
    public void buildSalaatti() {
        hampurilainen.append("Tuoretta rouskuvaa jäävuorisalaattia, ");
    }
    @Override
    public Object getHampurilainen() {
        return this.hampurilainen;
    }

}
