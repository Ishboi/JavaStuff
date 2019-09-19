package com.fabiolearnsjava;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    /**
     * My solution below
     */
/*    private String shape, name, color;

    public Lamp(String shape, String name, String color) {
        this.shape = shape;
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public void lightsOn() {
        lightRoom();
    }

    private String lightRoom() {
        return ("The room is illuminated");
    }*/

}
