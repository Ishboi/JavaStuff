package com.fabiolearnsjava;

public class Main {

    public static void main(String[] args) {
/*        int value = 3;
        if(value == 1) {
            System.out.println("Value as 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:case 4: case 5:
                System.out.println("was a 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
        char charSwitch = 'F';

        switch(charSwitch) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Character is " + charSwitch);
                break;
            default:
                System.out.println("Character not found instead found: " + charSwitch);
        }

        String month = "JAnuary";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("NOt sure");
                break;
        }
    }


}
