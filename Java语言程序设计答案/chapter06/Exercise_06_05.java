package chapter06;

import java.util.Scanner;

public class Exercise_06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        displaySortedNumbers(number1, number2, number3);

        input.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max = (num1 >= num2 ? num1 : num2) >= num3 ? (num1 >= num2 ? num1 : num2) : num3;
        double min = (num1 <= num2 ? num1 : num2) <= num3 ? (num1 <= num2 ? num1 : num2) : num3;
        double mid = (num1 + num2 + num3 - max - min);

        System.out.println(
                "The asceding sort of " + num1 + ", " + num2 + ", " + num3 + " is " + min + ", " + mid + ", " + max);
    }
}