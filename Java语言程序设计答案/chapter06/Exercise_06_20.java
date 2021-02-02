package chapter06;

import java.util.Scanner;

public class Exercise_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input string: ");
        String s = input.nextLine();

        System.out.println("The number of letters in the string " + s + " is " + countLetters(s));

        input.close();
    }

    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}