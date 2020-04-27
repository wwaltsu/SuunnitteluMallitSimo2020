package com.kmr;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Clock clock = new Clock(00,00,00);
        Clock clockCopy = clock.clone();
        clock.run();
        clockCopy.run();

    }


}

