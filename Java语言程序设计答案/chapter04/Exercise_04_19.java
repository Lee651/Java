package chapter04;

import java.util.Scanner;

public class Exercise_04_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String str = input.nextLine();

        int sum = 0;

        System.out.print("The ISBN-10 number is " + str);
        for (int i = 0; i < str.length(); i++) {
            int number = (int) str.charAt(i);
            sum += (number - 48) * (i + 1);
        }

        int d10 = sum % 11;

        if (d10 == 10) {
            System.out.println("x");
        } else {
            System.out.println(d10);
        }

        input.close();
    }
}