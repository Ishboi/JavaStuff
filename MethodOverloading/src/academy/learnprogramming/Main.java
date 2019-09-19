package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCentimeters(157);
        //double centimeters = calcFeetAndInchesToCentimeters(9);
        //System.out.println("centimeters - " + centimeters);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No layer scored, no player name");
        return 0;
    }

    /*My solution*/
/*    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet >= 0) && (inches >= 0 && inches <= 12)) {
            inches = (feet * 12);
            System.out.println("inches - " + inches);
            return (inches *2.54);

        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0 && inches <=12) {
            double feet = inches / 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }*/

    /**
     * His solution
     */
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet <0) || ((inches<0) || (inches > 12))) {
            System.out.println("Invalid feet or inches paremeters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet , " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches /12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }











}
