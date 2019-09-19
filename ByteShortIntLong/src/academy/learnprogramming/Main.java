package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte maximum value = " + myMaxByteValue);
        System.out.println("Byte maximum value = " + myMinByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short maximum value = " + myMaxShortValue);
        System.out.println("Short maximum value = " + myMinShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long maximum value = " + myMaxLongValue);
        System.out.println("Long maximum value = " + myMinLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);
        System.out.println(myNewByteValue + " -  " + myNewShortValue);

        byte challengeByte = 44;
        short challengeShort = 2131;
        int challengeInt = 345345;

        long challengeLong = (long)(50000 + (long)(challengeByte + challengeShort + challengeInt) * 10);

        System.out.println(challengeLong);


    }
}
