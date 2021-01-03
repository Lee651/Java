package chapter6;

import java.util.Scanner;

public class Exercise_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (verifyPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        input.close();
    }

    public static boolean verifyPassword(String str) {

        int len = str.length();
        int count = 0;
        boolean isTrue = true;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                count++;
            }
        }

        if (len >= 8 && count >= 2) {
            for (int j = 0; j < len; j++) {
                if ((str.charAt(j) >= 48 && str.charAt(j) <= 57) || Character.isLetter(str.charAt(j))) {
                    isTrue = true;
                } else {
                    isTrue = false;
                }
            }
        } else {
            isTrue = false;
        }

        return isTrue;
    }
}