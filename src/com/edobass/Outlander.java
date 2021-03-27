package com.edobass;

public class Outlander extends Car {
    private int roudServiceMonths;

    public Outlander(int wheels, int doors, int gears, boolean isManual, int roudServiceMonths) {
        super("Outlander","4WD", 5, 5, 6, false);
        this.roudServiceMonths = roudServiceMonths;
    }
}
