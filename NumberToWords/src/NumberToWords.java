public class NumberToWords {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static int reverse(int number) {
        int reverseNumber = 0;

        while(number != 0){
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;

        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int amountOfDigits = 0;
        if(number < 0) {
            return -1;
        }
        while(number >= 0) {
            int first = 0;
            if(number >= 0) {
                amountOfDigits++;
            }
            number /= 10;
            first++;
            if((first == 1) && (number == 0)) {
                break;
            }


        }
        return amountOfDigits;
    }

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }
        int originalNumber = number;
        int numberOfDigits = getDigitCount(number);
        int count = 1;

        int firstDigits = reverse(number);
        while(count <= numberOfDigits) {

            count++;
            switch(firstDigits%10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print(INVALID_VALUE_MESSAGE);
                    break;

            }
            firstDigits /= 10;

        }
            System.out.println("");

    }

}
