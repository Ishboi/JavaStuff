package com.fabiolearnsjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);



    }

    public static int[] getIntegers(int capacity) {
        int[] array =new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;

    }











    /**
     *  My solution
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println("Element " + i + " in array is: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] copyArray = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            copyArray[i] = array[i];
        }
        int tmp;

        System.out.println("\n**************Sorted array**************\n");
        for(int i = array.length-1; i>=0; i--) {
            for(int i2 = array.length-1; i2>=0; i2--) {
                if(array[i] < array[i2]) {
                    tmp = array[i];
                    array[i] = array[i2];
                    array[i2] = tmp;

                }
            }
        }

        return array;
    }
    */


}
