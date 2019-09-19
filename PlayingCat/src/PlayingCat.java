public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemp = 35;
        if (summer) {
            maxTemp = 45;
        }

        if(temperature >= 25 && temperature <= maxTemp) {
            return true;
        }
        return false;

    }

}
