package com.fabiolearnsjava;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel < 100 && tonerLevel > 0) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerLevel > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) { //his solution
        int pagesToPrint = pages;
        if(this.isDuplex) {
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public void printPage(int pages) {
        if(!paintExists(tonerLevel)) {
            System.out.println("No paint in toner.");
            return;
        } else {
            if(pages == 1) {
                pagesPrinted++;
                tonerLevel--;
                return;
            }
            if(isDuplex) {
                pagesPrinted += (int)Math.ceil(pages /2);
            } else {
                pagesPrinted += pages;
            }
            tonerLevel--;

        }

    }

    public boolean paintExists(int tonerLevel) {
        if(tonerLevel <= 0) {
            return false;
        }
        return true;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
