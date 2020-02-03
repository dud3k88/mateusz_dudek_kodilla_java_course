package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double baseArea;
    private double height;
    private static String figureName = "Triangle";

    public Triangle(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return figureName;
    }

    public double getField() {
        return (baseArea * height)/2;
    }
}
