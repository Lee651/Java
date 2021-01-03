package chapter5;

import java.util.Scanner;

public class Exercise_05_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String str = input.nextLine();

        int sum = 0;

        System.out.print("The ISBN-10 number is ");

        for (int i = 0; i < str.length(); i++) {
            sum += ((int) str.charAt(i) - 48) * (i + 1);
            System.out.print(str.charAt(i));
        }

        int d10 = sum % 11;
        
        if (d10 != 10) {
            System.out.println(d10);
        } else {
            System.out.println("x");
        }

        input.close();
    }
}