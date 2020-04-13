package com.kmr;

public class Main {
    public static void main(String[] args) {
        Ichain ichainCalc1 = new Superior();
        Ichain ichainCalc2 = new Boss();
        Ichain ichainCalc3 = new CEO();

        ichainCalc1.setNextChain(ichainCalc2);
        ichainCalc2.setNextChain(ichainCalc3);

        Begging request = new Begging(1);
        Begging request1 = new Begging(3);
        Begging request2 = new Begging(8);
        Begging request3 = new Begging(20);

        ichainCalc1.calculate(request);
        ichainCalc1.calculate(request1);
        ichainCalc1.calculate(request2);
        ichainCalc1.calculate(request3);



    }
}
