package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double baseArea;
    private double height;

    public Triangle(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public void getShapeName() {
        System.out.println("Triangle");
    }

    public double getField() {
        return (baseArea * height)/2;
    }
}
