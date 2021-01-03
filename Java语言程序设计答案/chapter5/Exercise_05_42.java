package chapter5;

import java.util.Scanner;

public class Exercise_05_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of money(> $5000) you want to earn in a year: ");
        double money = input.nextDouble();

        double needToEarn = money - 5000;
        double sales = 0;

        if (needToEarn <= 400) {
            sales = needToEarn / 0.08;
        } else if (needToEarn <= 900) {
            sales = 5000 + (needToEarn - 400) / 0.10;
        } else {
            sales = 10000 + (needToEarn - 900) / 0.12;
        }

        System.out.print("The minimum amount of sales you must achieve is: ");
        System.out.printf("%.2f\n", sales);

        input.close();
    }
}