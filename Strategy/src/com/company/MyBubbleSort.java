package com.company;

public class MyBubbleSort implements ISort {
    @Override
    public int[] sort(int[] input) {
        int n = input.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (input[i] > input[k]) {
                    swapNumbers(i, k, input);
                }
            }
        }
        return input;
    }
    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}