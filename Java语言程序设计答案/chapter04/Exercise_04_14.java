package chapter04;

import java.util.Scanner;

public class Exercise_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letter = input.nextLine();
        char cha = Character.toUpperCase(letter.charAt(0));

        if (cha >= 'A' && cha <= 'F' && cha != 'E') {
            System.out.print("The numeric value for grade " + cha + " is ");
            switch (cha) {
                case 'A':
                    System.out.println(4);
                    break;
                case 'B':
                    System.out.println(3);
                    break;
                case 'C':
                    System.out.println(2);
                    break;
                case 'D':
                    System.out.println(1);
                    break;
                default:
                    System.out.println(0);
                    break;
            }
        } else {
            System.out.println(cha + " is an invalid grade");
        }

        input.close();
    }
}
