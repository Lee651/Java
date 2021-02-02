package chapter05;

import java.util.Scanner;

public class Exercise_05_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of money saved: ");
        double money = input.nextDouble();

        System.out.print("Input annual interest rate: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of months deposited: ");
        int months = input.nextInt();

        double monthOfInterestRate = interestRate / 1200;

        double sum = money
                * ((Math.pow(1 + monthOfInterestRate, months + 1) - (1 + monthOfInterestRate)) / monthOfInterestRate);

        System.out.print("The amount of money in the account is ");
        System.out.printf("%7.3f\n", sum);

        input.close();
    }
}