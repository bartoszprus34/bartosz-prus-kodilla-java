package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int addTest = calculator.add(1,2);

        if (addTest == 3) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error!");
        }
        int subtractTest = calculator.subtract(5,3);

        if (subtractTest == 2) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
