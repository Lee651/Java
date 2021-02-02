package chapter04;

import java.util.Scanner;

public class Exercise_04_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String str1 = input.nextLine();

        System.out.print("Enter string s2: ");
        String str2 = input.nextLine();

        System.out.print(str2 + " is");

        if (str1.contains(str2)) {
            System.out.print("");
        } else {
            System.out.print(" not");
        }
        System.out.println(" a substring of " + str1);

        input.close();
    }
}