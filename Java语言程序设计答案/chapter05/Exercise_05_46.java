package chapter05;

import java.util.Scanner;

public class Exercise_05_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String cha = "";
        for (int i = 0; i < str.length(); i++) {
            cha = str.charAt(i) + cha;
        }

        System.out.println("The reversed string is " + cha);

        input.close();
    }
}