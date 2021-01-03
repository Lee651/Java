package chapter3;

import java.util.Date;
import java.util.Scanner;

public class Exercise_03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // 获取自1970年1月1日午夜以来的总毫秒数(两种获取方式)
        // long totalMilliseconds = System.currentTimeMillis();
        Date date = new Date();
        long totalMilliseconds = date.getTime();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        currentHour = currentHour + offset;

        System.out.println("The current time is " + ((currentHour > 12) ? currentHour -12 : currentHour) + ":" + currentMinute + ":" + currentSecond + ((currentHour > 12) ? " PM" : " AM"));

        input.close();
    }
}