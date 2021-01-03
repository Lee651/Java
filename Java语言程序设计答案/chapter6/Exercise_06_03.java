package chapter6;

import java.util.Scanner;

public class Exercise_06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("The " + number + ((isPalindrome(number)) ? " is" : " is not") + " a palindrome");


        input.close();
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }

    public static int reverse(int number) {
        String str = number + "";
        int len = str.length();
        String reverseNumber = "";

        for (int i = len - 1; i >= 0; i--) {
            reverseNumber += str.charAt(i);
        }

        return Integer.parseInt(reverseNumber);
    }
}