public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number < 0) return -1;
        int reverseNumber = 0;
        int originalNumber = number;
        int sum = 0;

        while(number != 0){
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            if(lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;

        }
        return sum;

    }

}
