package chapter02;

import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int bits = number % 10;
        int ten = number / 10 % 10;
        int hunderd_bit = number / 100;
        int sum = bits + ten + hunderd_bit;

        System.out.println("The sum of the digits is " + sum);

        input.close();
    }
}