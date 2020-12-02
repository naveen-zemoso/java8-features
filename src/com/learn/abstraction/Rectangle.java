package com.learn.abstraction;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return length * width;
    }
}
