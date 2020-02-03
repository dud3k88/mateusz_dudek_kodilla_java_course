package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideLenght;
    private static String figureName = "Square";

    public Square(double sideLength) {
        this.sideLenght = sideLength;
    }

    @Override
    public String getShapeName() {
        return figureName;
    }

    @Override
    public double getField() {
        return sideLenght * sideLenght;
    }
}
