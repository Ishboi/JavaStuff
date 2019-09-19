public class YearsDaysCalculator {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            System.out.println(minutes + " min = " + (long)(days/365) + "y  and " + (days%365) + " d");
        }
    }
}
