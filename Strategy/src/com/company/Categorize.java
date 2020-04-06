package com.company;

public class Categorize {

    private ISort order;
    private int[] num;
    public Categorize(ISort strategy, int[] numbers) {
        order = strategy;
        num = numbers;
    }
    public void order() {
        order.sort(num);
    }
}