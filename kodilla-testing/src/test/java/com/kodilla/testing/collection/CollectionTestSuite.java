package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;


public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Test Suite: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Suite: end");
    }
    @DisplayName("Testing list without numbers")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList=new ArrayList<>();
        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing"+listNumbers);
        //Then
        Assertions.assertEquals(emptyList,listNumbers);
    }
    @DisplayName("Testing list with numbers")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1410,531,63,122,34));
        ArrayList<Integer> oddList=new ArrayList<>(Arrays.asList(1410,122,34));

        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(list);
        System.out.println("Testing"+listNumbers);
        //Then
        Assertions.assertEquals(oddList,listNumbers);
    }
}