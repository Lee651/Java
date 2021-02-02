package chapter05;

import java.util.Scanner;

public class Exercise_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int number = input.nextInt();

        int count = 1;
        int max = 0;

        while (number != 0) {
            if (number > max) {
                max = number;
            } else if (number == max) {
                count++;
            } else {
                count += 0;
            }

            System.out.print("Enter numbers: ");
            number = input.nextInt();
        }

        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is: " + count);

        input.close();
    }
}