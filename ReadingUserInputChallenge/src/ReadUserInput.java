import java.util.Scanner;

public class ReadUserInput {

    public static boolean hasInt(Scanner scanner) {
        boolean hasInt = scanner.hasNextInt();
        return hasInt;
    }

    public static int readNumber(Scanner scanner) {
        int number = 0;
        while (!hasInt(scanner)) {
            System.out.print("Please enter a valid value: ");
            scanner.nextLine();

        }
        number = scanner.nextInt();
        scanner.nextLine();

        return number;
    }

}
