package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2019.125";
        System.out.println("numberAsString = " + numberAsString);
        Double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString +=1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


    }
}
