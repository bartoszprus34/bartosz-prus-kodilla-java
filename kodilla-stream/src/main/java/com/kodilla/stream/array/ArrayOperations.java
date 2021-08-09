package com.kodilla.stream.array;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        if (numbers == null) return 0;
        java.util.Arrays.stream(numbers, 0, numbers.length)
                .forEach(System.out::println);

        return java.util.Arrays.stream(numbers, 0, numbers.length)
                .average()
                .orElse(0);
    }
}