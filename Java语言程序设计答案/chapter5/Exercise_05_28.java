package chapter5;

import java.util.Scanner;

public class Exercise_05_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year and what day of the year's first day: ");
        int year = input.nextInt();
        int numberOfFirstWeek = input.nextInt();
        // int daysOfJanuary = 0;
        // int count = 2;

        // System.out.print("January 1, " + year + " is ");

        // switch (numberOfFirstWeek) {
        //     case 0:
        //         System.out.println("Sunday");
        //         break;
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     default:
        //         System.out.println("Saturday");
        //         break;
        // }

        // while (count <= 12) {
           
        //     switch (count) {
        //         case 2:
        //             System.out.print("February");
        //             break;
        //         case 3:
        //             System.out.print("March");
        //             break;
        //         case 4:
        //             System.out.print("April");
        //             break;
        //         case 5:
        //             System.out.print("May");
        //             break;
        //         case 6:
        //             System.out.print("June");
        //             break;
        //         case 7:
        //             System.out.print("July");
        //             break;
        //         case 8:
        //             System.out.print("August");
        //             break;
        //         case 9:
        //             System.out.print("September");
        //             break;
        //         case 10:
        //             System.out.print("October");
        //             break;
        //         case 11:
        //             System.out.print("November");
        //             break;
        //         default:
        //             System.out.print("December");
        //             break;
        //     }

        //     System.out.print(" 1, " + year + " is ");

        //     int count1 = count - 1;
        //     if (count1 == 2) {
        //         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //             daysOfJanuary += 29;
        //         } else {
        //             daysOfJanuary += 28;
        //         }
        //     } else if (count1 == 4 || count1 == 6 || count1 == 9 || count1 == 11) {
        //         daysOfJanuary += 30;
        //     } else {
        //         daysOfJanuary += 31;
        //     }

        //     int numberOfWeek =  (daysOfJanuary % 7 + numberOfFirstWeek) % 7;

        //     switch (numberOfWeek) {
        //         case 0:
        //             System.out.println("Sunday");
        //             break;
        //         case 1:
        //             System.out.println("Monday");
        //             break;
        //         case 2:
        //             System.out.println("Tuesday");
        //             break;
        //         case 3:
        //             System.out.println("Wednesday");
        //             break;
        //         case 4:
        //             System.out.println("Thursday");
        //             break;
        //         case 5:
        //             System.out.println("Friday");
        //             break;
        //         default:
        //             System.out.println("Saturday");
        //             break;
        //     }
        //     count++;
        // }

        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                    System.out.print("January");
                    break;
                case 2:
                    System.out.print("February");
                    break;
                case 3:
                    System.out.print("March");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("May");
                    break;
                case 6:
                    System.out.print("June");
                    break;
                case 7:
                    System.out.print("July");
                    break;
                case 8:
                    System.out.print("August");
                    break;
                case 9:
                    System.out.print("September");
                    break;
                case 10:
                    System.out.print("October");
                    break;
                case 11:
                    System.out.print("November");
                    break;
                default:
                    System.out.print("December");
                    break;
            }

            System.out.print(" 1, " + year + " is ");

            numberOfFirstWeek %= 7;

            switch (numberOfFirstWeek) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("Saturday");
                    break;
            }

            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numberOfFirstWeek += 29;
                } else {
                    numberOfFirstWeek += 28;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                numberOfFirstWeek += 30;
            } else {
                numberOfFirstWeek += 31;
            }
        }

        input.close();
    }
}