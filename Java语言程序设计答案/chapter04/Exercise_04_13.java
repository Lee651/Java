package chapter04;

import java.util.Scanner;

public class Exercise_04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char cha = letter.charAt(0);

        /*
         * if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u' || cha
         * == 'A' || cha == 'E' || cha == 'I' || cha == 'O' || cha == 'U') {
         * System.out.println(cha + " is a vowel"); } else if (((cha >= 65 && cha <= 90)
         * || (cha >= 97 && cha <= 122)) && (cha != 'a' || cha != 'e' || cha != 'i' ||
         * cha != 'o' || cha != 'u' || cha != 'A' || cha != 'E' || cha != 'I' || cha !=
         * 'O' || cha != 'U') ) { System.out.println(cha + " is a consonant"); } else {
         * System.out.println(cha + " is an invalid input"); }
         */

        if (Character.isLetter(cha)) {
            switch (Character.toUpperCase(cha)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(cha + " is a vowel");
                    break;
                default:
                    System.out.println(cha + " is a consonant");
                    break;
            }
        } else {
            System.out.println(cha + " is an invalid input");
        }

        input.close();
    }
}
