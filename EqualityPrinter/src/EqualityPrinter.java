public class EqualityPrinter {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printEqual (int first, int second, int third) {
        if((first < 0) || (second < 0) || (third < 0)) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if((first == second) && (first == third)) {
            System.out.println("All numbers are equal");
        } else if((first != second) && (first != third) && (second != third)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
