package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int addResult = calculator.add(30, 20);
        int substractResult = calculator.substract(40, 20);


        if (addResult == 50 && substractResult == 20) {
            System.out.println("works correctly");
        } else
            System.out.println("works incorrectly");
    }
}
