package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * My way
         *
         */
/*        byte challengeByte = 44;
        short challengeShort = 2131;
        int challengeInt = 3455;

        long challengeLong = (long)(50000 + (long)(challengeByte + challengeShort + challengeInt) * 10);

        System.out.println(challengeLong);*/

        /**
         * His way
         */
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue +shortValue + intValue);
        System.out.println(longTotal);
        short shortTotal = (short) (1000 + 10 *
                            (byteValue + shortValue + intValue));
    }
}
