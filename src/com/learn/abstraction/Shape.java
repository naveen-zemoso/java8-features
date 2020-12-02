package com.learn.abstraction;

public abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }
}
