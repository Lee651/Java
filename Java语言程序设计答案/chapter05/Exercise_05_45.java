package chapter05;

import java.util.Scanner;

public class Exercise_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number, mean = 0.0, deviation, sumOfSquares = 0.0;

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            number = input.nextDouble();
            mean += number;
            sumOfSquares += Math.pow(number, 2);
        }

        deviation = Math.pow((sumOfSquares - (Math.pow(mean, 2) / 10.0)) / 9.0, 0.5);
        mean /= 10;

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f\n", deviation);

        input.close();
    }
}