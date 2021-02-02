package chapter04;

import java.util.Scanner;

public class Exercise_04_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int number = input.nextInt();

        System.out.println("The character for ASCII code " + number + " is " + (char) number);

        input.close();
    }
}
