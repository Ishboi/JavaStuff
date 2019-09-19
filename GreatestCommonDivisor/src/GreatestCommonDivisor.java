public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {

        int maxNumber = first < second ? second : first;
        if((first < 10) || (second < 10)) {
            return -1;
        } else {
            for(int i = maxNumber; i > 0; i--) {
                if(((first % i) == 0) && ((second % i) == 0)) {
                    maxNumber = i;
                    break;

                }
            }
            return maxNumber;
        }

    }

}
