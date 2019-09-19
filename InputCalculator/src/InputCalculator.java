import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int count = 0;
        boolean isAnInt = true;
        while(isAnInt) {
            System.out.println("Enter number: ");
            isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                count++;
                totalSum += scanner.nextInt();
                scanner.nextLine();
            }


        }
        System.out.println("SUM = " + totalSum + " AVG = " + (count == 0 ? 0 : (int)Math.round((double)totalSum/count)));
        return;




    }

}
