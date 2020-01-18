package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getShapeName() {
        System.out.println("Circle");
    }

    @Override
    public double getField() {
        return 2 * pi * radius;
    }
}
