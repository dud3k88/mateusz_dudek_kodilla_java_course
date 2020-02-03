package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private static String figureName = "Circle";
    private static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return figureName;
    }

    @Override
    public double getField() {
        return pi * radius*radius;
    }
}
