package chapter5;

import java.util.Scanner;

public class Exercise_05_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();

        int remainder;
        String str = "";

        System.out.print("The decimal number " + number + " corresponds to the binary number is: ");

        while (number > 0) {
            remainder = number % 2;
            str += remainder;
            number /= 2;
        }

        int len = str.toCharArray().length - 1;

        while (len >= 0) {
            char cha = str.toCharArray()[len];
            if (len != 0) {
                System.out.print(cha);
            } else {
                System.out.println(cha);
            }
            
            len--;
        }

        // String binary = "";	// Holds the binary value
		// for (int i = number; i > 0; i /= 2) {
		// 	binary = (i % 2) + binary; 
		// }
        
        input.close();
    }
}