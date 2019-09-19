import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for(int i=0; i<10; i++) {
//            System.out.print("Enter " + (i+1) + " number - ");
//            sum += ReadUserInput.readNumber(scanner);
//        }
//        System.out.println("Total - " + sum);
//        scanner.close();
        /**
         * His solution
         */

        int counter = 0;
        int sum = 0;

//        while(true) {
        while(counter < 10){
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if(counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)

        }
        System.out.println("sum = " + sum);
        scanner.close();

    }

}
