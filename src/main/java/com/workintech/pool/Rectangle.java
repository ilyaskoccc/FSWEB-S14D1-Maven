package com.workintech.pool;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}
