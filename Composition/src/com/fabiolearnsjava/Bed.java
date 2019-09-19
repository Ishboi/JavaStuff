package com.fabiolearnsjava;

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Bed -> making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    /**
     * My solution below
     */
/*    private String shape, color;
    Dimensions dimensions;

    public Bed(String shape, String color, Dimensions dimensions) {
        this.shape = shape;
        this.color = color;
        this.dimensions = dimensions;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }*/
}
