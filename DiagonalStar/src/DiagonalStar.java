public class DiagonalStar {

    public static void printSquareStar(int number) {

        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        int first = 0;
        int last = number;
        for(int i = 1; i <= number; i++) {

            if(i == 1 || i == number) {
                for(int i2 = 0; i2 < number; i2++) {
                    System.out.print("*");
                }

            } else {
                for(int i2 = 1; i2<= number; i2++) {
                    if(i2 == 1 || i2 == number) {
                        System.out.print("*");
                    } else if(i == i2) {
                        System.out.print("*");

                    } else if(i2 == (number - i) +1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }


                }
            }
            System.out.println();
        }

    }

}
    //        *****
    //        ** **
    //        * * *
    //        ** **
    //        *****
    //
    //
    //                ********
    //                **    **
    //                * *  * *
    //                *  **  *
    //                *  **  *
    //                * *  * *
    //                **    **
    //                ********