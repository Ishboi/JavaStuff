public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        /**
         * Call method from my solution
        System.out.println(SecondsAndMinutesChallenge.getDurationString(61, 0));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(3601));
         */
        System.out.println(getDurationString(65L, 45L));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }


    /**
     * His solution
     */
    private static String getDurationString(long minutes, long seconds) {
      if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
          return INVALID_VALUE_MESSAGE;
      }

      long hours = minutes / 60;
      long remainingMinutes = minutes % 60;

      String hoursString = hours < 10 ? "0" + hours + "h " : hours + "h ";
      String minutesString = remainingMinutes < 10 ? "0" + remainingMinutes + "m " : remainingMinutes + "m ";
      String secondsString = seconds < 10 ? "0" + seconds + "s" : seconds + "s";

      return hoursString + minutesString + secondsString;

    };

    private static String getDurationString(long seconds) {
      if(seconds < 0) {
          return INVALID_VALUE_MESSAGE;
      }

      long minutes = seconds / 60;
      long remainingSeconds = seconds % 50;

      return getDurationString(minutes, remainingSeconds);

    };

}
