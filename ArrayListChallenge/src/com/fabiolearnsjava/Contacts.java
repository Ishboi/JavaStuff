package com.fabiolearnsjava;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<Integer> phoneNumber = new ArrayList<Integer>();

    public int findContactName(String name) {
        return this.name.indexOf(name);
    }
    public int findPhoneNumber(int phoneNumber) {
        return this.phoneNumber.indexOf(phoneNumber);
    }
    public boolean findContact(String name, int phoneNumber) {
        return findContactName(name) >= 0 && findPhoneNumber(phoneNumber) >= 0;
    }

    public void addContact(String name, int phoneNumber) {
        if(findContact(name) >= 0) {
            System.out.println("Contact already exists");
            return;
        }
        this.name.add(name);
        this.phoneNumber.add(phoneNumber);
    }

    public void printContacts() {
        System.out.println("You have " + name.size() + " contacts");
        for(int i = 0; i<name.size(); i++) {
            System.out.println((i+1) + "- " + name.get(i) + "\t Phone number: " + phoneNumber.get(i));
        }
    }

    public void printDetails(String name) {
        int position = findContactName(name);
        if(position >= 0) {
            String searchName = this.name.get(position);
            int searchNumber= this.phoneNumber.get(position);
            System.out.println("Contact name: " + searchName + "\t - Contact number: " +searchNumber);
        } else{
            System.out.println("Contact doesn't exist");
        }

    }

    public void modifyContact(String oldName, String name, int phoneNumber) {
        int position = findContact(oldName);
        System.out.println("Position is " + position);
        this.name.set(position, name);
        this.phoneNumber.set(position, phoneNumber);
        System.out.println("Contact number " + (position+1) + " has been modified.");
    }

    public int findContact(String name){
        return this.name.indexOf(name);
    }
    public void removeContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            removeContact(position);
        }

    }

    private void removeContact(int position) {
        name.remove(position);
        phoneNumber.remove(position);

    }


/*    public ArrayList<String> getName() {
        return this.name;
    }
    public ArrayList<Integer> getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }*/

}
