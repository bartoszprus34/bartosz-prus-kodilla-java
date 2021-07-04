package com.kodilla.testing.calculator;

import java.awt.*;
import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("What do you want to do?");
        char chosenAction;
        chosenAction = scanner.next().charAt(0);
        System.out.println("Give me first number");
        a = scanner.nextInt();
        System.out.println("Give me second number");
        b = scanner.nextInt();
        switch (chosenAction) {
            case '+':
                System.out.println("a+b=" + add(a, b));
                break;
            case '-':
                System.out.println("a-b=" + subtract(a, b));
                break;
        }
    }
}