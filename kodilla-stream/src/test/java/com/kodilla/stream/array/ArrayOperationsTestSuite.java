package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
    //Given
        int [] numbers = new int[] {2,3,4,5,6,7};
    //When
        double average = ArrayOperations.getAverage(numbers);
    //Then
        Assert.assertEquals(4.5, average, 0.1);
    }
}
