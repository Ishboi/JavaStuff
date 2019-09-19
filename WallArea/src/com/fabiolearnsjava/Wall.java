package com.fabiolearnsjava;

public class Wall {

    private double width, height;

    public Wall() {

    }

    public Wall(double width, double height) {
        if(width < 0) {
            width = 0;
        }
        if(height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return this.height*this.width;
    }

}
