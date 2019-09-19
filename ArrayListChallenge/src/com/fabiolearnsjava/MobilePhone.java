package com.fabiolearnsjava;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner input = new Scanner(System.in);
    //private static ArrayList<Contacts> ContactsList = new ArrayList<Contacts>();
    private static Contacts ContactsList = new Contacts();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    ContactsList.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    alterContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choise of options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a new a contact.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");

    }

    public static void addContact() {

        System.out.print("Please enter the contact name: ");
        String name = input.nextLine();
        System.out.print("Please enter the contact phone number: ");
        int contactNumber = input.nextInt();
        input.nextLine();
        ContactsList.addContact(name, contactNumber);
    }

    public static void alterContact() {
        System.out.print("Contact name to alter: ");
        String oldName = input.nextLine();
        System.out.print("Enter new contact name: ");
        String newName = input.nextLine();
        System.out.print("Enter new contact number: ");
        int contactNumber = input.nextInt();
        input.nextLine();
        if(ContactsList.findContact(oldName) >= 0) {
            ContactsList.modifyContact(oldName, newName, contactNumber);
        } else {
            System.out.println("Contact doesn't exist");
        }

    }

    public static void searchContact() {
        System.out.print("Contact name to search for: ");
        String searchContact = input.nextLine();
        if(ContactsList.findContact(searchContact) >= 0) {
            System.out.println("Found " + searchContact + " here are his/hers contact details: \n");
            ContactsList.printDetails(searchContact);
        } else {
            System.out.println(searchContact + " not found.");
        }
    }

    public static void removeContact() {
        System.out.print("Enter contact name: ");
        String name = input.nextLine();
        ContactsList.removeContact(name);
    }
}
