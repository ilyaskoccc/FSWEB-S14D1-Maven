package com.workintech.cylinder;

public class Cylinder extends Circle {
    private double height;
    private double x;

    public Cylinder(double x, double height) {
        super(x);
        if (height < 0.0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea()*this.height;
    }
}
