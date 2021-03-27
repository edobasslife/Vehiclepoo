package com.edobass;

public class Outlander extends Car {
    private int roudServiceMonths;

    public Outlander(int roudServiceMonths) {
        super("Outlander","4WD", 5, 5, 6, false);
        this.roudServiceMonths = roudServiceMonths;
    }
}
