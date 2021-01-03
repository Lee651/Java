package chapter4;

import java.util.Scanner;

public class Exercise_04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();

        System.out.print(month + " " + year + " has ");

        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.print(31);
                break;
            case "Apr":
            case "Jun":
            case "Sept":
            case "Nov":
                System.out.print(30);
                break;
            default:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.print(29);
                } else {
                    System.out.print(28);
                }
                break;
        }
        System.out.println(" days");

        input.close();
    }
}