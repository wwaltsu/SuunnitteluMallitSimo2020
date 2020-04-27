package com.kmr;

import java.util.concurrent.TimeUnit;

public class Clock implements Cloneable {
    MinutePointer minutePointer = new MinutePointer();
    SecondPointer secondPointer = new SecondPointer();
    HourPointer hourPointer = new HourPointer();

    public Clock(int hours, int minutes, int seconds) {
        hourPointer.setHours(hours);
        minutePointer.setMinute(minutes);
        secondPointer.setSeconds(seconds);

    }
    public void run() {
        for(int i = 0; i < 5; i ++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            secondPointer.increaseSeconds();
            if (secondPointer.getSeconds()==60){
                secondPointer.setSeconds(0);
                minutePointer.increaseMinute();
                if(minutePointer.getMinute() == 60) {
                    hourPointer.increaseHours();
                }
            }
            System.out.println(hourPointer.getHours() + " hours " + minutePointer.getMinute() + " minutes " + secondPointer.getSeconds() + " seconds");

        }
        System.out.println("Run has ended");
        System.out.println("****************************");
    }
    public Clock clone() {
        Clock clock = null;
        try {
            try {
                clock = (Clock) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return clock;
    }

}
