package com.fabiolearnsjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Main bunchTest = new Main(); //just for remembering the damn object method
        int[] array = bunchTest.getIntegers();
        bunchTest.printArray(array);
        reverse(array);
        bunchTest.printArray(array);
        String arrayString = Arrays.toString(array);
        System.out.println("Reversed array with toString function = " +
                arrayString.replace('[',' ').replace(']', ' '));


    }

    private int[] getIntegers() {
        System.out.println("***Enter size of array***");
        int[] array = new int [input.nextInt()];
        input.nextLine();
        for(int i = 0; i<array.length; i++) {
            array[i] = input.nextInt();
            input.nextLine();
        }
        return array;
    }

    private static void reverse(int[] array) {
        int temp;
        for(int i = 0, i2 = array.length-1; i<array.length/2; i++, i2--){
            temp = array[i];
            array[i] = array[i2];
            array[i2] = temp;
        }
    }
    private void printArray(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
