package chapter06;

import java.util.Scanner;

public class Exercise_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        reverse(number);

        input.close();
    }

    public static void reverse(int number) {
        String str = number + "";
        String reverseNumber = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            reverseNumber += str.charAt(i);
        }
        System.out.println("The reverse number of " + number + " is " + reverseNumber);
    }
}