package com.kmr;

import java.util.Iterator;

public class RunnableDtht implements Runnable {

    private Iterator iterator;
    public RunnableDtht(Iterator iterator) {
        this.iterator = iterator;
    }
    @Override
    public void run() {
        System.out.print("Lista : ");
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }
}