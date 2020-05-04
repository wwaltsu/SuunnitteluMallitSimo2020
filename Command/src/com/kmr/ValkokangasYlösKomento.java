package com.kmr;

public class ValkokangasYlösKomento implements Command {
    private Valkokangas valkokangas;
    public ValkokangasYlösKomento(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }
    @Override // Command
    public void execute() {
        valkokangas.turnOn();
    }
}