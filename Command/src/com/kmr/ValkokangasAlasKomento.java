package com.kmr;

public class ValkokangasAlasKomento implements Command {
    private Valkokangas valkokangas;
    public ValkokangasAlasKomento(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }
    @Override // Command
    public void execute() {
        valkokangas.turnOff();
    }
}