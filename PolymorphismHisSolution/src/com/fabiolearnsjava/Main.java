package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage" , 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgegrAddition1("Tomato", 0.27);
        hamburger.addHamburgegrAddition2("Lettuce", 0.75);
        hamburger.addHamburgegrAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgegrAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Heealthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgegrAddition3("Shouldn't do this" , 50.53);
        db.itemizeHamburger();


    }
}
