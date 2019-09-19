package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
        Printer newPrinter = new Printer(1, true);
        newPrinter.printPage(2);
        System.out.println(newPrinter.getPagesPrinted());
        System.out.println(newPrinter.getTonerLevel());

        /**
         * Using his solution
         */

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());


    }
}
