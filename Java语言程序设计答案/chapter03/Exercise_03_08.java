package chapter03;

import java.util.Scanner;

public class Exercise_03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int temp;
        if (number1 >= number2 || number1 >= number3) {
            if (number1 >= number2) {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }

            if (number1 >= number3) {
                temp = number1;
                number1 = number3;
                number3 = temp;
            }
        }

        if (number2 >= number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        System.out.println(number1 + " " + number2 + " " + number3);

        input.close();
    }
}