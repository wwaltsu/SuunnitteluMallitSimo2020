package com.kmr;

public class Boss implements Ichain {
    private Ichain nextInIchain;

    @Override
    public void setNextChain(Ichain nextIchain) {
        nextInIchain = nextIchain;
    }

    @Override
    public void calculate(Begging request) {
        if (request.getRequestedWagePercent() > 2 && request.getRequestedWagePercent() < 5) {
            System.out.println("Annan palkkakorotuksen uusi palkkasi on nyt " + request.getRequestedWagePercent() + "% suurempi");

        } else {
            System.out.println("Mene kysymään pomolta, en saa päättää noin suuresta palkankorotuksesta");
            nextInIchain.calculate(request);
        }
    }
}
