package chapter4;

import java.util.Scanner;

public class Exercise_04_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String x = input.nextLine();

        System.out.println("The Unicode for the character " + x + " is " + (int)x.charAt(0));

        input.close();
    }
}
