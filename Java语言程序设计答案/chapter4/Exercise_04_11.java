package chapter4;

import java.util.Scanner;

public class Exercise_04_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");

        int number = input.nextInt();

        if (number >= 0 && number <= 9) {
            System.out.println("The hex value is " + number);
        } else if (number <= 15) {
            System.out.println("The hex value is " + (char)(number + 'A' - 10));
        } else {
            System.out.println(number + " is an invalid input");
        }

        input.close();
    }
}
