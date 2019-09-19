package com.fabiolearnsjava;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }


}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}



/**
 * His solution above
 */

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


        /**
         * My solution below
         */
//        Car car = new Car("Nissan", "Skyline", 16, 4, 2);
//        Car hondaNSX = new Honda();
//        Car toyotaCorolla = new Toyota();
//
//        System.out.println(car.getName() + "\nModel : " + car.getModel());
//        System.out.println(hondaNSX.getName() + "\nModel : " + hondaNSX.getModel());
//        System.out.println(toyotaCorolla.getName() + "\nModel : " + toyotaCorolla.getModel());
//        toyotaCorolla.hasSwag(true);
//        System.out.println(toyotaCorolla.isSwag());
//        toyotaCorolla.noise("Deja vu\n" +
//                "I've just been in this place before\n" +
//                "Higher on the street\n" +
//                "And I know it's my time to go\n" +
//                "Calling you, and the search is a mystery\n" +
//                "Standing on my feet\n" +
//                "It's so hard when I try to be me, woah");
//        hondaNSX.noise("BRRRRBRUUUMM");
//
//        System.out.println(car.getName());
    }


}
