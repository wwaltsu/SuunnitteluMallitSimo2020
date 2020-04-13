package com.kmr;

public class Boss implements Ichain {
    private Ichain nextInIchain;

    @Override
    public void setNextChain(Ichain nextChain) {
        nextInIchain = nextChain;
    }

    @Override
    public void newSalary(Begging request) {
        if (request.getRequestedWagePercent() > 2 && request.getRequestedWagePercent() < 5) {
            System.out.println("Pomo: annan "+ request.getRequestedWagePercent() + "% palkkakorotuksen uusi palkkasi on nyt " + request.getNewSalary() + "€");

        } else {
            System.out.println("Pomo: mene kysymään pomolta, en saa päättää noin suuresta palkankorotuksesta");
            nextInIchain.newSalary(request);
        }
    }
}
