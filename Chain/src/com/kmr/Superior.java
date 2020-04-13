package com.kmr;

public class Superior implements Ichain {
    private Ichain nextInIchain;

    @Override
    public void setNextChain(Ichain nextChain) {
        nextInIchain = nextChain;

    }

    @Override
    public void newSalary(Begging request) {
        if (request.getRequestedWagePercent() > 0 && request.getRequestedWagePercent() <= 2 ) {
            System.out.println("Lähiesimies: annan "+ request.getRequestedWagePercent() + "% palkkakorotuksen uusi palkkasi on nyt " + request.getNewSalary() + "€");

        } else {
            System.out.println("Lähiesimies: mene kysymään päälliköltä, en saa päättää noin suuresta palkankorotuksesta ");
            nextInIchain.newSalary(request);

        }
    }

}
