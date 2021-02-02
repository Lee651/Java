package chapter03;

import java.util.Scanner;

public class Exercise_03_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int first9Digits = input.nextInt();

        int d1 = first9Digits / 100000000;
        int d2 = first9Digits / 10000000 % 10;
        int d3 = first9Digits / 1000000 % 10;
        int d4 = first9Digits / 100000 % 10;
        int d5 = first9Digits / 10000 % 10;
        int d6 = first9Digits / 1000 % 10;
        int d7 = first9Digits / 100 % 10;
        int d8 = first9Digits / 10 % 10;
        int d9 = first9Digits % 10;
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

        if (d10 == 10) {
            System.out.println("x");
        } else {
            System.out.println(d10);
        }

        input.close();
    }
}