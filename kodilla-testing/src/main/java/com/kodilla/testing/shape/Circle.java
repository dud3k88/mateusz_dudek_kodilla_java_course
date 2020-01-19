package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape getShapeName() {
        System.out.println("Circle");
        return null;
    }

    @Override
    public double getField() {
        return pi * radius*radius;
    }
}
