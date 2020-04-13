package com.kmr;

public class Begging {
    private double requestedWagePercent;
    private double salary;
    private double newSalary;

    public Begging(double requestedWagePercent, double salary) {
        this.requestedWagePercent = requestedWagePercent;
        this.salary = salary;
        this.newSalary = (requestedWagePercent/100 + 1) * salary;
    }

    public double getRequestedWagePercent() {
        return requestedWagePercent;
    }

    public double getNewSalary() {
        return newSalary;
    }
}


