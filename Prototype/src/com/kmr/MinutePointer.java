package com.kmr;

import java.util.concurrent.TimeUnit;

public class MinutePointer {
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


}
