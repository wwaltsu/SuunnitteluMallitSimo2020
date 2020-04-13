package com.kmr;

public class CEO implements Ichain {
    private Ichain nextInIchain;

    @Override
    public void setNextChain(Ichain nextChain) {
        nextInIchain = nextChain;
    }

    @Override
    public void newSalary(Begging request) {
        if (request.getRequestedWagePercent() > 5 && request.getRequestedWagePercent() <= 15 ) {
            System.out.println("CEO: Annan "+ request.getRequestedWagePercent() + "% palkkakorotuksen uusi palkkasi on nyt " + request.getNewSalary() + "€");

        } else if (request.getRequestedWagePercent() > 15 ) {
                System.out.println("CEO: Poistu 30 minuutiksi ja mieti pyyntösi uudelleen, nyt pyydät paljoa.");

        } else {
            System.out.println("CEO: mene kysymään päälliköltä, en saa päättää noin suuresta palkankorotuksesta ");
            nextInIchain.newSalary(request);

        }


        }
}
