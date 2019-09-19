package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
//        BankAccount bank1 = new BankAccount(12324, 0.00, "Fabio C", "fabio@gmail.com", 966666666);
//        System.out.println(bank1.getAccountNumber());
//        System.out.println(bank1.getBalance());
//        System.out.println(bank1.getCustomerName());
//        System.out.println(bank1.getEmail());
//        System.out.println(bank1.getPhoneNumber());
//        bank1.withdraw(999);
//        System.out.println(bank1.getBalance());
//        bank1.deposit(7777);
//        System.out.println(bank1.getBalance());
//
//
//        BankAccount bank2 = new BankAccount();
//        System.out.println(bank2.getAccountNumber());
//        System.out.println(bank2.getCustomerName());
//        System.out.println(bank2.getPhoneNumber());
//        System.out.println(bank2.getEmail());
//        System.out.println(bank2.getBalance());
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", 12345);
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());


        VipCustomer vipAccount1 = new VipCustomer();
        System.out.println("Vip customer name: " + vipAccount1.getCustomerName() + "\nVip credit limit: " + vipAccount1.getCreditLimit() + "\nVipCustomer email: " + vipAccount1.getCustomerEmail());

        VipCustomer vipAccount2 = new VipCustomer("2nd vip", 2000);
        System.out.println("Vip customer name: " + vipAccount2.getCustomerName() + "\nVip credit limit: " + vipAccount2.getCreditLimit() + "\nVipCustomer email: " + vipAccount2.getCustomerEmail());

        VipCustomer vipAccount3 = new VipCustomer("3rd vip customer", 12, "vip3@email.vip");
        System.out.println("Vip customer name: " + vipAccount3.getCustomerName() + "\nVip credit limit: " + vipAccount3.getCreditLimit() + "\nVipCustomer email: " + vipAccount3.getCustomerEmail());




    }
}
