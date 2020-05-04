package com.kmr;
public class SecondPointer implements Cloneable {
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

    public SecondPointer clone() throws CloneNotSupportedException {
        SecondPointer MinutePointer = null;
        return (SecondPointer) super.clone();

    }
}



