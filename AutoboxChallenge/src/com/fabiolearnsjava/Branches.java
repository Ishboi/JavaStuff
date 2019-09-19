package com.fabiolearnsjava;

import java.util.ArrayList;

public class Branches {
    public String branchName;
    private static ArrayList<Customers> customersList = new ArrayList<Customers>();
    private static ArrayList<Double> transactions = new ArrayList<Double>();

//    public Branches() {
////        customersList = new ArrayList<Customers>();
//
//    }

    private int searchCustomer(String name) {
        for(int i = 0; i<customersList.size(); i++) {
            if(findPosition(name, i) >= 0) {
                int index = findPosition(name, i);
                return index;
            }
        }
        return -1;
    }
    private int findPosition(String name, int currItem) {
        return customersList.get(currItem).findClientName(name);
    }

    public void addCustomer(String name, Double firstTransaction) {
        int index = searchCustomer(name);
        if(index >= 0) {
            System.out.println("Contact already exists");
            return;
        }
        customersList.get(index).customerTransaction(name, firstTransaction);
    }

    public void makeTransaction(String customerName, Double transaction) {
        int index = searchCustomer(customerName);
        if(index >= 0) {

            transactions.add(transaction);

        } else {
            System.out.println("Customer doesn't exist. Please try again.\n");
        }
    }




}
