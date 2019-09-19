package com.fabiolearnsjava;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if(number > 0) {
            return number%2 > 0;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sumOdd = 0;
        if((end >= start) && (start > 0 && end > 0)) {
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sumOdd += i;
                }
            }
            return sumOdd;

        } else {
            return -1;
        }

    }

}