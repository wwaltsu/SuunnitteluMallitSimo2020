package com.kmr;

public class Main {
    public static void main(String[] args) {
        Ichain superior = new Superior();
        Ichain boss = new Boss();
        Ichain ceo = new CEO();

        superior.setNextChain(boss);
        boss.setNextChain(ceo);

        Begging request = new Begging(1,5000);
        Begging request1 = new Begging(3,7500);
        Begging request2 = new Begging(8,2000);
        Begging request3 = new Begging(20,4000);

        System.out.println("Ensimmäinen pyyntö:");
        superior.newSalary(request);
        System.out.println("Toinen pyyntö:");
        superior.newSalary(request1);
        System.out.println("Kolmas pyyntö:");
        superior.newSalary(request2);
        System.out.println("Neljäs pyyntö:");
        superior.newSalary(request3);



    }
}
