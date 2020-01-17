package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {


    public ArrayList<Integer>exterminate (ArrayList<Integer> numbers){

        ArrayList<Integer> oddList = new ArrayList<>();

        for (Integer temporary : numbers)
            if (temporary % 2 == 0) {
                oddList.add(temporary);
            }

        return oddList;
    }
}
