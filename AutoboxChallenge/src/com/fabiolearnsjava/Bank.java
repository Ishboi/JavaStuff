package com.fabiolearnsjava;

import java.util.ArrayList;

public class Bank {

    private static ArrayList<Branches> branchesList = new ArrayList<Branches>();
    String bankName;

    public Bank(String name) {
        this.bankName = name;
//        this.branchesList = new ArrayList<Branches>();
    }

    public int searchBranch(String name) {
        int index = findBranch(name);
        for(int i = 0; i<branchesList.size(); i++) {
            if(index >= 0) {
                System.out.println("Branch " + name + " already exists.\n");
            }
        }
        return index;
    }
    private int findBranch(String name) {
        return branchesList.indexOf(name);
    }

    public void addBranch(String name) {
        int index = searchBranch(name);
        if(index >= 0) {
            System.out.println("Please try again\n");
        } else {
            this.branchesList.add(name);
        }

    }


}
