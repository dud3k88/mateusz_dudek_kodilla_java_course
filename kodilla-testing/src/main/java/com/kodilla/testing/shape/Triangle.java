package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double baseArea;
    private double height;

    public Triangle(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public Shape getShapeName() {
        System.out.println("Triangle");
        return null;
    }

    public double getField() {
        return (baseArea * height)/2;
    }
}
