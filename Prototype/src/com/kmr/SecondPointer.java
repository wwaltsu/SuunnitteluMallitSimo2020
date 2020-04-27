package com.kmr;

import java.util.concurrent.TimeUnit;

public class SecondPointer {
    private int seconds;

    public void increaseSeconds() {
            this.seconds++;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
