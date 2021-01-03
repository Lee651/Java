package chapter5;

import java.util.Scanner;

public class Exercise_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int k = 2;

        System.out.print("The minimum factor of " + number + " is: ");

        while (number >= 2) {
            if (number % k == 0) {
                number /= k;
                if (number == 1) {
                    System.out.println(k);
                } else {
                    System.out.print(k + "、");
                }
            } else {
                k++;
            }
        }
        
        input.close();
    }
}