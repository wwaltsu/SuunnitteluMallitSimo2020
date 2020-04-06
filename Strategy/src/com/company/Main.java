package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] insertionArr = new int[100000];
        int[] selectionArr = new int[100000];
        int[] bubbleArr = new int[100000];

        for (int r = 0; r < 100000; r++) {
            selectionArr[r] = rnd.nextInt(100000);
            insertionArr[r] = rnd.nextInt(100000);
            bubbleArr[r] = rnd.nextInt(100000);
            System.out.println("[" + selectionArr[r] + "] ");
        }
        Categorize selectionSort = new Categorize(new MySelectionSort(),selectionArr);
        Categorize insertionSort = new Categorize(new MyInsertionSort(),insertionArr);
        Categorize bubbleSort = new Categorize(new MyBubbleSort(),bubbleArr);


        double selectionStartTime = System.currentTimeMillis();
        System.out.print("<------SELECTION SORT STRATEGY------>");
        selectionSort.order();
        double sortingTotalTime = System.currentTimeMillis() - selectionStartTime;
        numberList(selectionArr);
        System.out.println("selectionSort: " + sortingTotalTime / 1000 + "seconds");

        double insertionStartTime = System.currentTimeMillis();
        System.out.print("<-------INSERTION SORT STRATEGY------------>");
        insertionSort.order();
        double insertionTotalTime = System.currentTimeMillis() - insertionStartTime;
        numberList(insertionArr);
        System.out.println("insertionSorting: " + insertionTotalTime / 1000 + "seconds");

        double bubbleStartTime = System.currentTimeMillis();
        System.out.print("<------------BUBBLE SORT STRATEGY---------->");
        bubbleSort.order();
        double bubbleTotalTime = System.currentTimeMillis() - bubbleStartTime;
        numberList(bubbleArr);

        System.out.println(" bubble Sort: " + bubbleTotalTime / 1000 + "seconds");
        System.out.println("<-------------------Recap-------------------->");
        System.out.println("bubbleSort: " + bubbleTotalTime / 1000 + "seconds");
        System.out.println("insertionSort: " + insertionTotalTime / 1000 + "seconds");
        System.out.println("selectionSort: " + sortingTotalTime / 1000 + "seconds");
        System.out.println("Total time took to sort 3 different arrays " + (sortingTotalTime + insertionTotalTime + bubbleTotalTime) / 1000 + "seconds");
    }

    private static void numberList(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(" [" + input[i] + "] ");
        }
    }

}

