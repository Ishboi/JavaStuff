package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
        int sum = 1;
        int count = 0;
	    for(int i = 1; i<=1000; i++) {
	        if((i%3 == 0) && (i%5 == 0)) {
	            if(count < 5) {
                    System.out.println("Divided by 3 and 5 number is: " + i);
                    sum += i;
	                count++;
                } else {
	                break;
                }
            }
        }

        System.out.println("Sum of numbers divided by both 3 and 5 is: " + sum);

    }
}
