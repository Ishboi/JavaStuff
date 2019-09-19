package com.fabiolearnsjava;

import java.util.ArrayList;

public class Customers {

    String name;
    private double amount;
    private static ArrayList<Double> transactionsList = new ArrayList<>();
//    public Customers(String name, double transaction) {
//        this.name = name;
//        this.amount = transaction;
//        transactionsList = new ArrayList<Double>();
//    }

    public int findClientName(String name) {
        return this.name.indexOf(name);
    }

    public void customerTransaction(String name, Double transaction) {
        this.name = name;
        transactionsList.add(transaction);
    }


}
