package com.fabiolearnsjava;

import java.util.ArrayList;

public class Customers {

    String name;
    private double amount;
    private static ArrayList<Double> transactionsList;
    public Customers(String name, double transaction) {
        this.name = name;
        this.amount = transaction;
        transactionsList = new ArrayList<Double>();
    }

}
