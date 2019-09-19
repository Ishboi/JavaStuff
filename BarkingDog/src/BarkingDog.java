public class BarkingDog {
    public static boolean shouldWakeUp(boolean bark, int hourOfDay) {
        if(bark) {
            if((hourOfDay < 8 && hourOfDay >=0) || (hourOfDay > 22 && hourOfDay < 24)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
