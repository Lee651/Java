package chapter05;

import java.util.Scanner;

public class Exercise_05_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        String cha = "";

        int len = str1.length() < str2.length() ? str1.length() : str2.length();

        for (int i = 0; i < len; i++) {
            if (str1.charAt(0) == str2.charAt(0)) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    cha += str1.charAt(i);
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        if (cha != "") {
            System.out.println("The common prefix is " + cha);
        } else {
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        }

        // int index = 0;
        // String prefix = "";

        // while (string1.charAt(index) == string2.charAt(index)) {
        // prefix += string1.charAt(index);
        // index++;
        // }

        // if (prefix.length() > 0)
        // System.out.println("The commmon prefix is " + prefix);
        // else
        // System.out.println(string1 + " and " + string2 +
        // " have no commmon prefix");

        input.close();
    }
}