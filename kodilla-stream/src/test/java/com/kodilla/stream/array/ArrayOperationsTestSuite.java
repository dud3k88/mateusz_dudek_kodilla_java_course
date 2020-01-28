package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
    //Given
        int [] numbers = new int[] {};
    //When
        double average = ArrayOperations.getAverage(numbers);
        System.out.println(average);
    //Then
        Assert.assertEquals(0, average,0.1);
    }
}
