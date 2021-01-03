package chapter6;

import java.util.Scanner;

public class Exercise_06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        String stringNumber = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                stringNumber += getNumber(Character.toLowerCase(str.charAt(i)));
            } else {
                stringNumber += str.charAt(i);
            }
        }

        System.out.println(stringNumber);

        input.close();
    }

    public static int getNumber(char uppercaseLstter) {
        int s = 0;

        if (uppercaseLstter <= 99) {
            s += 2;
        } else if (uppercaseLstter <= 102) {
            s += 3;
        } else if (uppercaseLstter <= 105) {
            s += 4;
        } else if (uppercaseLstter <= 108) {
            s += 5;
        } else if (uppercaseLstter <= 111) {
            s += 6;
        } else if (uppercaseLstter <= 115) {
            s += 7;
        } else if (uppercaseLstter <= 118) {
            s += 8;
        } else {
            s += 9;
        }

        return s;
    }
}