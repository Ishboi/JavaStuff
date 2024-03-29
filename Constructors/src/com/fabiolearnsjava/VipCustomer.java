package com.fabiolearnsjava;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VipCustomer() {
        this("Default name", 0.0, "default@email.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "2ndconstructor@email.com");
    }

    public VipCustomer(String customerName, double creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
