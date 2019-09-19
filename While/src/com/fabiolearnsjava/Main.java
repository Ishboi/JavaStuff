package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//	    count = 0;
//	    for(count=1; count<6; count++) {
//            System.out.println("Count value is " + count);
//        }
//
//	    count = 1;
//	    while(true) {
//	        if(count == 6) {
//	            break;
//            }
//            System.out.println("Count value is " + count);
//	        count++;
//        }

//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if(count >100) {
//                break;
//            }
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int countEven = 0;
        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            countEven++;
            System.out.println("Even number " + number);
            if(countEven == 5) break;
        }
        System.out.println("Total even numbers: " + countEven);

    }


    public static boolean isEvenNumber(int number) {
        if(number%2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
