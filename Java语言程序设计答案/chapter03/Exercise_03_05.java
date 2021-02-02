package chapter03;

import java.util.Scanner;

public class Exercise_03_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int week = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int days = input.nextInt();

        int futureDay = (week + days) % 7;

        switch (week) {
            case 0:
                System.out.print("Today is Sunday");
                break;
            case 1:
                System.out.print("Today is Monday");
                break;
            case 2:
                System.out.print("Today is Tuesday");
                break;
            case 3:
                System.out.print("Today is Wednesday");
                break;
            case 4:
                System.out.print("Today is Thursday");
                break;
            case 5:
                System.out.print("Today is Friday");
                break;
            case 6:
                System.out.print("Today is Saturday");
                break;
        }

        switch (futureDay) {
            case 0:
                System.out.print(" and the future day is Sunday");
                break;
            case 1:
                System.out.print(" and the future day is Monday");
                break;
            case 2:
                System.out.print(" and the future day is Tuesday");
                break;
            case 3:
                System.out.print(" and the future day is Wednesday");
                break;
            case 4:
                System.out.print(" and the future day is Thursday");
                break;
            case 5:
                System.out.print(" and the future day is Friday");
                break;

            default:
                System.out.print(" and the future day is Saturday");
                break;
        }
        input.close();
    }
}