package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3 , 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Room bedRoom = new Room("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();









/**
 * My solution below
 */
/*        Room room1 = new Room(new Wall("Black", new Dimensions(10,50, 1)),
                                new Wall("Black", new Dimensions(10,50, 1)),
                                new Wall("Black", new Dimensions(20,50, 1)),
                                new Wall("Black", new Dimensions(20,50, 1)),
                                new Lamp("Heart", "chandellier", "Red"),
                                new Bed("Oval", "Red and blue", new Dimensions(150, 200, 1)),
                                new Ceiling("Blue", "Concrete", new Dimensions(10, 1, 1)),
                                new Ceiling("Blue", "Concrete", new Dimensions(10, 1, 1))
                                );

        System.out.println(room1.getBed());
        System.out.println(room1.getCeiling().getPattern());
        System.out.println(room1.getCeiling().getColor());
        System.out.println(room1.getCeiling().getDimensions().getDepth());
        System.out.println(room1.getCeiling().getDimensions().getHeight());
        System.out.println(room1.getCeiling().getDimensions().getWidth());
        System.out.println(room1.getNorthWall());
        System.out.println(room1.getSouthWall());
        System.out.println(room1.getWestWall());
        System.out.println(room1.getEastWall());
        System.out.println(room1.getCeiling().getColor());
        System.out.println(room1.getCeiling().getPattern());*/




    }
}
