package com.fabiolearnsjava;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }





    /**
     * My solution
     */
//    private int wheels, doors, weight;
//
//    public Vehicle(int wheels, int doors, int weight) {
//        this.wheels = wheels;
//        this.doors = doors;
//        this.weight = weight;
//    }
//
//    public int getWheels() {
//        return wheels;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
}
