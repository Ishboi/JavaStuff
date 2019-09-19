public class DigitSum {

    /**
     * My solution, this one is to convert them all to a sum of just a single, so it wasn't what was intended derp
     */
//    public static int sumDigits(int number) {
//        int count = 0;
//        int sum = 0;
//        int lastDigit = number%10;
//        if((number <= 10) || (number < 0)) return -1;
//        while(number > 10) {
//            sum = 0;
//            count = number % 10;
//            number /= 10;
//            sum += count + number + lastDigit;
//        }
//        return sum;
//    }

    /**
     * His solution
     */

    protected static int sumDigits(int number) {

        if(number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125-120 = 5
        while(number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /=10; // same as number = number / 10;
        }

        return sum;

    }


}
