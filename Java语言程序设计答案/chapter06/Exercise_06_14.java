package chapter06;

import java.util.Scanner;

public class Exercise_06_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        calculatePI(number);

        input.close();
    }

    public static void calculatePI(int number) {
        System.out.println("i          m(i)");

        for (int j = 1; j <= (900 + number); j += 100) {
            double sum = 0.0;
            for (int i = 1; i <= j; i++) {
                sum += Math.pow(-1, i + 1) / (2 * i - 1.0);
            }

            sum *= 4;

            System.out.printf("%-10d%.4f\n", j, sum);
        }
    }
}