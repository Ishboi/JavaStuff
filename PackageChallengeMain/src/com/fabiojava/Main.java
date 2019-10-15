package com.fabiojava;

import java.util.List;

import static com.series.challenge.Series.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> values = factorial(10);
        for(int value : factorial(10)) {
            System.out.println("Value from factorial is - " + value);
        }

        List<Integer> totalSum = nSum(10);

        for(int value: totalSum) {
            System.out.println("Value from sum is - " + value);
        }

        for(int value : fibonacci(10)) {
            System.out.println("Value from fibonacci is - " + value);
        }

    }
}
