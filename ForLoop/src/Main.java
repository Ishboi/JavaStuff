public class Main {



    public static void main(String[] args) {
/*        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0D, 2.0D));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0D, 3.0D));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0D, 4.0D));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0D, 5.0D));*/

        for(int i= 2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0D, i)));
        }
        System.out.println("******************************");
        for(int i= 8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0D, i)));
        }

        int countPrimes = 0;
        for(int i = 10; i<50; i++) {
            if(isPrime(i)) {
                System.out.println("Prime number is: " + i);
                countPrimes++;
                if(countPrimes == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("Number of primes in this range of numbers is - " + countPrimes);
    }


    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        //for(int i=2; i <= n/2; i++) { //greater number of times that needs to loop
        for(int i=2; i <= (long)Math.sqrt(n); i++) { //this one with squareroot
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

}
