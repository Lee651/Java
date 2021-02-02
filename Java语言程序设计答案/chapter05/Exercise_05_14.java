package chapter05;

import java.util.Scanner;

public class Exercise_05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int temp;
        int gcd;

        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }

        gcd = number1;

        System.out.print("The greatest common divisor of " + number1 + " and " + number2 + " is: ");
        while (gcd > 1) {

            if (number1 % gcd == 0 && number2 % gcd == 0) {
                System.out.println(gcd);
                break;
            } else {
                gcd--;
                if (gcd == 1) {
                    System.out.println(gcd);
                }
            }
        }
        input.close();
    }
}