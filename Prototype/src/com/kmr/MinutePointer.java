package com.kmr;

public class MinutePointer implements Cloneable {
    private int minute;
    public void increaseMinute() {
        minute++;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getMinute() {
        return minute;
    }

    public MinutePointer clone() throws CloneNotSupportedException {
        MinutePointer MinutePointer = null;
        return (MinutePointer) super.clone();

    }
}


