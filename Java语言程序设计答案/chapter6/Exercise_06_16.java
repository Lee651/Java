package chapter6;

public class Exercise_06_16 {
    public static void main(String[] args) {
        int year = 2000;

        for (int i = year; i <= (year + 20); i++) {

            System.out.println("The year of " + i + " total has " + numberOfDaysInAYear(i) + " days");
        }
    }

    public static int numberOfDaysInAYear(int year) {
        int days;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            days = 366;
        } else {
            days = 365;
        }
        return days;
    }
}