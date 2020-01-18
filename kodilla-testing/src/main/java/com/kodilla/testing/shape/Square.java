package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideLenght;
    private double height;

    public Square(double sideLength, double height) {
        this.sideLenght = sideLength;
        this.height = height;
    }

    @Override
    public void getShapeName() {
        System.out.println("Square");
    }

    @Override
    public double getField() {
        return sideLenght * height;
    }
}
