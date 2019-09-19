public class LargestPrime {

    public static int getLargestPrime(int number) {

        int greatestPrime = 1;
        if(number <= 0 || number == 1) {
            return -1;
        }
        for(int i = 1; i < number; i++) {
            int prime = 0;
            for(int i2 = 1; i2 <=i; i2++) {
                    if(((i/i2) * i2) == i) {
                    prime++;
                }
            }
            if(prime == 2) {
                greatestPrime = i;

            }
        }
        return greatestPrime;


    }

}
