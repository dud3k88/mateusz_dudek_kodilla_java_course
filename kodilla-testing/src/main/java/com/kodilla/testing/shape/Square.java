package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideLenght;

    public Square(double sideLength) {
        this.sideLenght = sideLength;
    }

    @Override
    public Shape getShapeName() {
        System.out.println("Square");
        return null;
    }

    @Override
    public double getField() {
        return sideLenght * sideLenght;
    }
}
