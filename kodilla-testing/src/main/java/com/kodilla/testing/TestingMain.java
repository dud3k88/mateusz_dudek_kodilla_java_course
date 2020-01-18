package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addResult = calculator.add(30, 20);
        int substractResult = calculator.substract(40, 20);


        if (addResult == 50 && substractResult == 20) {
            System.out.println("works correctly");
        } else
            System.out.println("works incorrectly");
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(3));

    }
}
