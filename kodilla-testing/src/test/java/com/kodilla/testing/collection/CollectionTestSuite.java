package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test


    public void testOddNumbersExterminatorEmptyList() {
        List<Integer> temporaryList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        if (oddNumbersExterminator.exterminate((ArrayList<Integer>) temporaryList).size() == 0) {
            System.out.println("The method works correctly. ");
        } else {
            System.out.println("The method works incorrectly. ");
        }

    }




    @Test
    public void testOddNumbersExterminatorNormalList() {
        List<Integer> temporaryList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <30; i++) {
            temporaryList.add(random.nextInt(50));
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> oddsList = oddNumbersExterminator.exterminate((ArrayList<Integer>) temporaryList);

        int moduloSum = 0;
        for (Integer inputList : oddsList) {
            moduloSum+= inputList % 2;
        }

        if (moduloSum == 0) {
            System.out.println("The test works correctly, the list contains only even numbers");
        } else {
            System.out.println("The test works correctly, the list contains even and odds numbers");
        }



    }

}





