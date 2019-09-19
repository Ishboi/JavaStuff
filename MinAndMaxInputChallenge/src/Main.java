import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int max = 0;
//        int min = 0;
//        boolean  first = true;
//        boolean isAnInt = true;
//
//        while(isAnInt) {
//            int order = counter +1;
//            System.out.println("Enter number #" + order + ": " );
//
//            isAnInt = scanner.hasNextInt();
//            if(isAnInt) {
//                int number = scanner.nextInt();
//                if(first) {
//                    first = false;
//                    max = number;
//                    min = number;
//                }
//                max = number > max ? number : max;
//                min = Math.min(min, number);
//                System.out.println("Greatest number is: " + max + "\nSmaller number is: " + min);
//                counter++;
//
//            } else {
//                System.out.println("Invalid Value");
//                System.out.println("Greatest number is: " + max + "\nSmaller number is: " + min);
//                break;
//            }
//            scanner.nextLine();
//
//        }

        /**
         * His solution
         */

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //boolean  first = true;

        while(true) {

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {

                int number = scanner.nextInt();

//                if(first) {
//                    first = false;
//                    max = number;
//                    min = number;
//                }


                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {


                break;
            }

            scanner.nextLine(); // handle input



        }
        System.out.println("min = " + min + ", max= " + max);


        scanner.close();



    }

}
