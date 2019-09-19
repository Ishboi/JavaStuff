package com.fabiolearnsjava;

import java.util.ArrayList;

public class Bank {

    private static ArrayList<Branches> branchesList;
    String bankName;

    public Bank(String name) {
        this.bankName = name;
        this.branchesList = new ArrayList<Branches>();
    }

}
