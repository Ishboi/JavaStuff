package com.fabiolearnsjava;

public class Hamburger {

    private String breadRollType, meat, addition, name;
    private double burger;
    private int lettuce, tomato, pickles, extraCheese;
    private double basePrice, cost;
//    private boolean lettuce;
//    private boolean tomato;
//    private boolean pickles;
//    private boolean extraCheese;

    public Hamburger(String breadRollType, String meat, double basePrice, String name) {
        this.burger = 4.5;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
        this.cost = basePrice;

    }

    public void addToppings(int lettuce, int tomato, int pickles, int extraCheese) {
        if((lettuce+tomato+pickles+extraCheese) <= 4 && (lettuce+tomato+pickles+extraCheese) >= 0) {
            this.cost += ((lettuce+tomato+pickles+extraCheese) * 1.75);
        }
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getCost() {
        return cost;
    }

    public void getAdditionals() {
        System.out.println("Lettuce: " + lettuce);
        System.out.println("Tomato: " + tomato);
        System.out.println("Pickles: " + pickles);
        System.out.println("Extra cheese: " + extraCheese);
    }
}

class HealthyBurguer extends  Hamburger {

    private int lettuce, tomato;
    private double cost;
    private double basePrice = super.getBasePrice();


    public HealthyBurguer(String meat, double basePrice, int lettuce, int tomato) {
          super("Brown rye bread roll", meat, 5.20, "Healthy");

          this.lettuce = lettuce;
          this.tomato = tomato;
    }

    public void addToppings(int lettuce, int tomato) {
        if((lettuce+tomato) <=6 && (lettuce+tomato) >= 0) {
            this.basePrice += ((lettuce+tomato) * 1.75);
        }
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public void getAdditionals() {
        super.getAdditionals();
    }
}

class DeluxeHamburger extends  Hamburger {

    private String breadRollType, meat, name;
    private int lettuce, tomato, pickles, extraCheese;
    boolean chips = true, drinks = true;

    public DeluxeHamburger(String breadRollType, String meat, String name, int lettuce, int tomato, int pickles, int extraCheese) {
        super(breadRollType, meat, 8.20, "Deluxe");
        this.name = name;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.extraCheese = extraCheese;

    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public void getAdditionals() {
        super.getAdditionals();
        System.out.println("Comes with chips and drinks");
    }
}
