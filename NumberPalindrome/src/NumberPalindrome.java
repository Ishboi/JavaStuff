public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reverseNumber = 0;

        while(number != 0){
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;

        }

        return reverseNumber == originalNumber;


    }

}
