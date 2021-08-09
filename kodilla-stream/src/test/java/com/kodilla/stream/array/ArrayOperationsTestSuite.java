package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        double average = ArrayOperations.getAverage(new int[]{52,20,3,33,12,100,8,64,128,51,1,23,33,34,81,98,14,0,2,20});

        //When

        //Then
        Assertions.assertEquals(38.85, average);
    }
}