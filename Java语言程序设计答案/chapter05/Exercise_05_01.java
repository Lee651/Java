package chapter05;

import java.util.Scanner;

public class Exercise_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");

        double number, sum = 0, average;
        int totalCount = 0, positivesCount = 0, negativesCount = 0;

        lo: while (true) {
            number = input.nextDouble();
            totalCount++;
            sum += number;

            if (number > 0) {
                positivesCount++;
            } else if (number < 0) {
                negativesCount++;
            } else {
                break lo;
            }
        }

        System.out.println("The number of positives is: " + positivesCount);
        System.out.println("The number of negatives is: " + negativesCount);
        System.out.println("The total is " + sum);

        System.out.print("The average is ");
        if (totalCount == 1) {
            System.out.println(0);
        } else {
            average = sum / (totalCount - 1);
            System.out.println(average);
        }

        input.close();
    }
}