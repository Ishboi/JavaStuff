package com.fabiolearnsjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Players fabio = new Players("Fabio" , 10, 15);
        System.out.println(fabio.toString());
        saveObject(fabio);

        fabio.setHitPoints(8);
        System.out.println(fabio);
        fabio.setWeapon("Baseball bat");
        saveObject(fabio);
        // loadObject(fabio);
        System.out.println(fabio);

        ISaveable werewolf = new Monsters("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monsters) werewolf).getStrength()); // if werewolf was declared as Monsters type it wouldn't be need but since its declared as a interface it's needed to specify like so ((Monsters) werewolf).getStrength()
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
