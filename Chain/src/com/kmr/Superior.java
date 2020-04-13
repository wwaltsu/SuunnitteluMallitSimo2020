package com.kmr;

public class Superior implements Ichain {
    private Ichain nextInIchain;

    @Override
    public void setNextChain(Ichain nextIchain) {
        nextInIchain = nextIchain;

    }

    @Override
    public void calculate(Begging request) {
        if (request.getRequestedWagePercent() > 0 && request.getRequestedWagePercent() <= 2 ) {
            System.out.println("Annan palkkakorotuksen uusi palkkasi on nyt " + request.getRequestedWagePercent() + "% suurempi");

        } else {
            System.out.println("Mene kysymään päälliköltä, en saa päättää noin suuresta palkankorotuksesta ");
            nextInIchain.calculate(request);

        }
    }

}
