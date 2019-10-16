package com.fabiojava.series.test;

import java.util.Scanner;

public class X {

    private int x;
    public X() {
    System.out.print("Enter your number > ");
    Scanner x = new Scanner(System.in);
     this.x = x.nextInt();
     x.nextLine();
    }

    public void x() {
        for(int x = 1; x <= 10; x++) {
            System.out.println(this.x + " * " + x + " is = " + (this.x * x));
        }
    }



}
