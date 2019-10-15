package com.series.challenge;

import java.util.ArrayList;
import java.util.List;

public class Series {

    public static List<Integer> nSum(int n) {
        List<Integer> total = new ArrayList<Integer>();
        for(int i = 0, count = 0; i <= n; i++) {
            total.add(i+count);
            count += i;
        }
        return total;
    }

    public static List<Integer> factorial (int n) {
        List<Integer> totalFactorialValue = new ArrayList<Integer>();
        int totalFact = n;
        for(int i = n; i > 0; i--) {
            for(int j = 1; j < i; j++) {
                totalFact *= j;
            }
            totalFactorialValue.add(totalFact);
            totalFact = i-1;
        }
        return totalFactorialValue;
    }

    public static List<Integer> fibonacci(int n) {

        int total = 0;
        List<Integer> totalFibonacci = new ArrayList<Integer>();
        totalFibonacci.add(1);
        for(int i = 1; i<= n; i++) {
            if(totalFibonacci.size() <= 2) {
                totalFibonacci.add(1);
                continue;

            } else {
                int lastButOne = totalFibonacci.get(i-1);
                int secondToLast = totalFibonacci.get(i-2);
                System.out.println("Last but one is: " + lastButOne +
                                    "\nSecond to last: " + secondToLast);
                total = (lastButOne + secondToLast);
            }

            totalFibonacci.add(total);
        }
        return totalFibonacci;

    }



}
