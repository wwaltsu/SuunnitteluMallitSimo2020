package com.kmr;

import java.util.Iterator;

public class RunnableAtht implements Runnable {
    private Iterator iterator;
    public RunnableAtht(Iterator iterator) {
        this.iterator = iterator;
    }
    @Override
    public void run() {
            System.out.print("Lista : ");
            while (iterator.hasNext())
                System.out.print(iterator.next() + " ");
            System.out.println();
    }
}
