public class Main {

    public static void main(String[] args) {
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(1010101010);
        NumberToWords.numberToWords(10);
        NumberToWords.numberToWords(2000);
        NumberToWords.numberToWords(3010);
        NumberToWords.numberToWords(1010);

        System.out.println("**********************");
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        System.out.println("**********************");
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));

    }

}
