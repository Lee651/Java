package chapter04;

import java.util.Scanner;

public class Exercise_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String str = input.nextLine();
        char cha = str.charAt(0);

        if (Character.isLetter(Character.toLowerCase(cha))) {
            System.out.print("The corresponding number is ");
            if (cha <= 99) {
                System.out.println(2);
            } else if (cha <= 102) {
                System.out.println(3);
            } else if (cha <= 105) {
                System.out.println(4);
            } else if (cha <= 108) {
                System.out.println(5);
            } else if (cha <= 111) {
                System.out.println(6);
            } else if (cha <= 115) {
                System.out.println(7);
            } else if (cha <= 118) {
                System.out.println(8);
            } else if (cha <= 122) {
                System.out.println(9);
            }
        } else {
            System.out.println(cha + " is an invalid input");
        }

        input.close();
    }
}
