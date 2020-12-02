package com.learn.abstraction;

public class Circle extends Shape {

    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * Math.pow(radius, 2);
    }

}
