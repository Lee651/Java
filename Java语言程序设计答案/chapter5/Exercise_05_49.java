package chapter5;

import java.util.Scanner;

public class Exercise_05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int vowelsNumber = 0, consonantsNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (Character.toUpperCase(str.charAt(i)) == 'A' || 
                Character.toUpperCase(str.charAt(i)) == 'E' ||
                Character.toUpperCase(str.charAt(i)) == 'I' ||
                Character.toUpperCase(str.charAt(i)) == 'O' ||
                Character.toUpperCase(str.charAt(i)) == 'U') {
                    vowelsNumber++;
                } else {
                    consonantsNumber++;
                }
            } else {
                continue;
            }
        }

        System.out.println("The number of vowels is: " + vowelsNumber);
        System.out.println("The number of consonants is " + consonantsNumber);

        input.close();
    }
}