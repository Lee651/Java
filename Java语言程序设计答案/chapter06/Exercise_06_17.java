package chapter06;

import java.util.Random;
import java.util.Scanner;

public class Exercise_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        printMatrix(number);

        input.close();
    }

    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n) {
                    System.out.println(new Random().nextInt(2));
                } else {
                    System.out.print(new Random().nextInt(2) + " ");
                }
            }
        }
    }
}