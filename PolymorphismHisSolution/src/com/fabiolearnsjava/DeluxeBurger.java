package com.fabiolearnsjava;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgegrAddition1("Chips", 2.75);
        super.addHamburgegrAddition2("Drink", 1.81);

    }

    @Override
    public void addHamburgegrAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgegrAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgegrAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgegrAddition4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
