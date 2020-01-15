package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator(30,40);

        int addResult = calculator.add();
        int substractResult = calculator.substract();


        if (addResult == calculator.getA()+calculator.getB()){
            System.out.println("works correctly");
        }else
            System.out.println("works incorrectly");

        if (substractResult == calculator.getA()-calculator.getB()){
            System.out.println("works correctly");
        }else
            System.out.println("works incorrectly");
        }


}
