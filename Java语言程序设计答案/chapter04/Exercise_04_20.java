package chapter04;

import java.util.Scanner;

public class Exercise_04_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = input.nextLine();

        int len = str.length();
        char cha = str.charAt(0);

        System.out.println("The String's length is " + len);
        System.out.println("The first char of the String is " + cha);

        input.close();
    }
}