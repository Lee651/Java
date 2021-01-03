package chapter5;

import java.util.Scanner;

public class Exercise_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String str = input.nextLine();

        if (str.length() != 12) {
            System.out.println(str + " is an invalid input");
        } else {
            System.out.print("The ISBN-13 number is " + str);

            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                int number = (int)str.charAt(i) - 48;
                if (i % 2 != 0) {
                    sum += number * 3;
                } else {
                    sum += number;
                }
            }
            int last = 10 - sum % 10;

            if (last == 10) {
                System.out.println(0);
            } else {
                System.out.println(last);
            }
        }

        input.close();
    }
}