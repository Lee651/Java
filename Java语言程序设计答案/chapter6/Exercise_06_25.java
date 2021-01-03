package chapter6;

public class Exercise_06_25 {
    public static void main(String[] args) {
        long millis = 555550000;

        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        String str = totalHours + ":" + currentMinute + ":" + currentSecond;

        return str;
    }
}