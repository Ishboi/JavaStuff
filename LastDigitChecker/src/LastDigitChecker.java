public class LastDigitChecker {

    public static boolean hasSameLastDigit(int first, int second, int third) {

        if((isValid(first)) && (isValid(second)) && (isValid(third))) {

            if(((first % 10) == (second % 10)) || ((first%10) == (third % 10)) || ((second % 10) == (third % 10)) ) {
                return true;
            }

        }


        return false;

    }

    public static boolean isValid(int number) {
        if(((number >= 10) && (number <= 1000))) {
            return true;
        }
        return false;
    }

}
