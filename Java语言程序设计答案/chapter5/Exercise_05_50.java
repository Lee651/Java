package chapter5;

import java.util.Scanner;

public class Exercise_05_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int uppercaseLettersNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                uppercaseLettersNumber++;
            } else {
                continue;
            }
        }

        System.out.println("The number of uppercase letters is " + uppercaseLettersNumber);

        input.close();
    }
}