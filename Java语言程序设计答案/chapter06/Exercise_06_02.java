package chapter06;

import java.util.Scanner;

public class Exercise_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextInt();

        System.out.println("The sum of the numbers is: " + sumDigits(number));

        input.close();
    }

    public static int sumDigits(long n) {
        int len = (n + "").length();
        int sum = 0;

        int digits1 = (int) (n / Math.pow(10, len - 1));

        while (len >= 2) {
            int digit = (int) (n / Math.pow(10, len - 2)) % 10;
            sum += digit;
            len--;
        }

        int sumDigits = digits1 + sum;
        return sumDigits;
    }
}