package com.fabiolearnsjava;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

//	    int[] array = readIntegers(5);
//	    int min = findMin(array);
//        System.out.println("Minimum value inserted is: " + min + "!");

    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
//            if(scanner.hasNextInt()) {
//                array[i] = scanner.nextInt();
//            }
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


}
