package chapter6;

import java.util.Scanner;

public class Exercise_06_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first char: ");
        char ch1 = input.next().charAt(0);

        System.out.print("Enter the last char: ");
        char ch2 = input.next().charAt(0);

        System.out.print("Enter the number of printings per line specified: ");
        int numberPerLine = input.nextInt();

        printChars(ch1, ch2, numberPerLine);

        input.close();
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 1;
        for (int i = (int)ch1; i <= (int)ch2; i++) {
            if (count % numberPerLine == 0 || i == (int)ch2) {
                System.out.println((char)i);
            } else {
                System.out.print((char)i + " ");
            }
            count++;
        }
    }
}