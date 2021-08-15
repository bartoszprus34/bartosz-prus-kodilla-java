package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        try {
            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(8, 0);
        } catch(ArithmeticException e) {
            System.out.println("Dzielenie przez zero! " + e);
        } finally {
            System.out.println("Zadanie zostało włączone");
        }
    }
}