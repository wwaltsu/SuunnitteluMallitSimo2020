package com.kmr;

import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));
        ArrayList<String> listD = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));

        Iterator iteratorOne = list.iterator();
        Iterator iteratorTwo = list.iterator();
        Iterator iteratorThree = list.iterator();
        Iterator iteratorFour = list.iterator();
        Iterator iteratorFive = listD.iterator();
        // A KOHTA
        System.out.println("");
        System.out.println("************** A KOHTA **************");
        try {
           new Thread(new RunnableAtht(iteratorOne)).run();
           new Thread(new RunnableAtht(iteratorTwo)).run();
        } catch (Exception e) {
            System.out.println("Jotain meni pieleen");
        }
        // B KOHTA ==> Tuloksena lista on käyty ja sen jälkeen kun annetaan seuraavalle se on jo iteroitu ja palauttaa tyhjän listan
        System.out.println("************** B KOHTA **************");
        try {
            new Thread(new RunnableAtht(iteratorThree)).run();
            new Thread(new RunnableAtht(iteratorThree)).run();
        } catch (Exception e) {
            System.out.println("Jotain meni pieleen");
        }
        System.out.println("************** C KOHTA **************");
        // Ei voida muokata ajojen välissä
        try {
            new Thread(new RunnableAtht(iteratorFour)).run();
            list.addAll(Arrays.asList("11","12","13","14","15","16","17","18","19","20"));
            new Thread(new RunnableAtht(iteratorFour)).run();
        } catch (Exception e) {
            System.out.println(e);
        }
        /*
         Iteraattorissa ei voida poistaa käyttämällä remove metodia
         */
        System.out.println("************** D KOHTA **************");
        try {
            new Thread(new RunnableDtht(iteratorFive)).run();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

