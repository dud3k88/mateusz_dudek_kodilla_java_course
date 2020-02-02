package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;


public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        Double result = IntStream.range(0, numbers.length)
                .map(t -> numbers[t])
                .average()
                .orElse(0);

        return result;

    }
}