public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int reverseNumber = 0;
        int lastDigit = number % 10;
        int firstDigit = 0;
        if(number < 0) return -1;

        while(number != 0){
            firstDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;

        }
        return (firstDigit + lastDigit);
    }


}
