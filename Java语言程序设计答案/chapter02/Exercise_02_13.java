package chapter02;

import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        int monthly = input.nextInt();

        double sum = monthly * (1 + 0.00417);
        for (int i = 1; i < 6; i++) {
            sum += monthly;
            sum *= (1 + 0.00417);
        }

        System.out.println("After the sixth month, the account value is $" + sum);

        input.close();
    }
}