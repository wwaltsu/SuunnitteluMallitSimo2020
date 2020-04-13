package com.kmr;

public class CEO implements Ichain {
    private Ichain nextInIchain;

    @Override
    public void setNextChain(Ichain nextIchain) {
        nextInIchain = nextIchain;
    }

    @Override
    public void calculate(Begging request) {
        if (request.getRequestedWagePercent() > 5 && request.getRequestedWagePercent() <= 15 ) {
            System.out.println("Annan palkkakorotuksen uusi palkkasi on nyt " + request.getRequestedWagePercent() + "% suurempi");

        } else if (request.getRequestedWagePercent() > 15 ) {
                System.out.println("Poistu 30min ja mieti pyyntösi uudelleen, nyt pyydät paljoa.");

        } else {
            System.out.println("Mene kysymään päälliköltä, en saa päättää noin suuresta palkankorotuksesta ");
            nextInIchain.calculate(request);

        }


        }
}
