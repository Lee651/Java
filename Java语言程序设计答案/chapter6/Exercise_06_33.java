package chapter6;

import java.text.SimpleDateFormat;

public class Exercise_06_33 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm:ss");
        String dateStr = dateFormat.format(totalMilliseconds);
        System.out.println(dateStr);
    }
}