package chapter05;

import java.util.Scanner;

public class Exercise_05_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();

        int remainder;
        String str = "";

        System.out.print("The decimal number " + number + " corresponds to the octal number is: ");

        while (number > 0) {
            remainder = number % 8;
            str += remainder;
            number /= 8;
        }

        int len = str.toCharArray().length - 1;

        while (len >= 0) {
            char cha = str.toCharArray()[len];
            if (len != 0) {
                System.out.print(cha);
            } else {
                System.out.println(cha);
            }

            len--;
        }

        input.close();
    }
}