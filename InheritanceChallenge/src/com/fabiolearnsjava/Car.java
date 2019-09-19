package com.fabiolearnsjava;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed,direction);
    }




    /**
     * My solution
     */

//    public int gear, speed;
//    private String steering;
//
//    public Car(int wheels, int doors, int weight) {
//        super(wheels, doors, weight);
//        this.gear = 0;
//        this.speed = 0;
//    }
//
//    public int getGear() {
//        return gear;
//    }
//    public int getSpeed() {
//        return speed;
//    }
//
//    public String getSteering() {
//        return steering;
//    }
//
//    public void setGear(int gear) {
//        System.out.println("Gear changed to: " + gear);
//        this.gear = gear;
//    }
//
//    public void setSteering(String steering) {
//        System.out.println("Currently steering to " + steering);
//        this.steering = steering;
//    }
//
//    public void move(int speed) {
//        this.speed = speed;
//        System.out.println("This car is moving at " + speed + "km/h, in " + gear + " gear and steering to the " + steering);
//    }
}
