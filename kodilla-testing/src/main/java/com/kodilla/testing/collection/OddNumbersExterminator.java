package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        if (numbers.isEmpty()) {
            return numbers;
        } else {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    oddNumbers.add(number);
                }
            }
            return oddNumbers;
        }
    }
}