package com.kmr;

public class HourPointer implements Cloneable {
    private int hours;

        public void increaseHours() {
            hours++;
        }
        public int getHours() {
            return hours;
        }
        public void setHours(int hours) {
            this.hours = hours;
        }

        public HourPointer clone() throws CloneNotSupportedException {
            HourPointer hourPointer = null;
            return (HourPointer) super.clone();

        }
    }
