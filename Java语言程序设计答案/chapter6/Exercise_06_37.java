package chapter6;

import java.util.Scanner;

public class Exercise_06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter the width of the number: ");
        int width = input.nextInt();

        System.out.println(format(number, width));

        input.close();
    }

    public static String format(int number, int width) {
        String str1 = String.valueOf(number);
        String str2 = "";

        if (str1.length() < width) {
            for (int i = 0; i < (width - str1.length()); i++) {
                str2 += 0;
            }

            str2 += str1;
        } else {
            str2 += str1;
        }

        return str2;
    }
}