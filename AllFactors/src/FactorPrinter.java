public class FactorPrinter {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printFactors(int number) {

        if(number > 1) {

            for(int i = 1; i<=number; i++) {
                if((number%i) == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
//            int i = 1;
//            while(i <= number) {
//                if(number % i == 0) {
//                    System.out.print(i + " ");
//                }
//                i++;
//            }
//            System.out.println("");

        } else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }

    }

}
