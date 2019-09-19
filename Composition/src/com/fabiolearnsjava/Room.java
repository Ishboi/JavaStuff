package com.fabiolearnsjava;

public class Room {

    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }



    /**
     * My solution below
     */


//    private Wall northWall, southWall, westWall, eastWall;
//    private Lamp lamp;
//    private Bed bed;
//    private Ceiling ceiling;
//    private Ceiling floor;
//
//    public Room(Wall northWall, Wall southWall, Wall westWall, Wall eastWall, Lamp lamp, Bed bed, Ceiling ceiling, Ceiling floor) {
//        this.northWall = northWall;
//        this.southWall = southWall;
//        this.westWall = westWall;
//        this.eastWall = eastWall;
//        this.lamp = lamp;
//        this.bed = bed;
//        this.ceiling = ceiling;
//        this.floor = floor;
//    }
//
//    public Wall getNorthWall() {
//        return northWall;
//    }
//
//    public Wall getSouthWall() {
//        return southWall;
//    }
//
//    public Wall getWestWall() {
//        return westWall;
//    }
//
//    public Wall getEastWall() {
//        return eastWall;
//    }
//
//    public Lamp getLamp() {
//        return lamp;
//    }
//
//    public Bed getBed() {
//        return bed;
//    }
//
//    public Ceiling getCeiling() {
//        return ceiling;
//    }
//
//    public Ceiling getFloor() {
//        return floor;
//    }
}
