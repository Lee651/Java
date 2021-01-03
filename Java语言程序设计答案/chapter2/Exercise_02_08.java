package chapter2;

import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // 获取自1970年1月1日午夜以来的总毫秒数(两种获取方式)
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        currentHour = currentHour + offset;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

        input.close();
    }
}