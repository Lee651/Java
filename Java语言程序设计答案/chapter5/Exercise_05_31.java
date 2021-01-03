package chapter5;

import java.util.Scanner;

public class Exercise_05_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial deposit amount: ");
        double money = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter maturity period(number of months): ");
        int months = input.nextInt();

        double monthOfInterestRate = annualInterestRate / 1200.0;

        double sum;

        System.out.println("Month CD Value");

        for (int i = 1; i <= months; i++) {
            sum = money * Math.pow(1 + monthOfInterestRate, i);
            System.out.print(i + "     ");
            System.out.printf("%8.2f\n", sum);
        }

        input.close();
    }
}