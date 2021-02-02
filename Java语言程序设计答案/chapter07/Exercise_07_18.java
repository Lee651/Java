package chapter07;

import java.util.Scanner;

public class Exercise_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.print("The order is:");
        for (double e : bubbleSort(numbers)) {
            System.out.print(" " + e);
        }

        System.out.println();

        input.close();
    }

    public static double[] bubbleSort(double[] numbers) {
        double tem;

        lo: while (true) {
            boolean isBubbleSort = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    tem = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tem;
                }
            }

            for (int j = 0; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[j] <= numbers[k]) {
                        continue;
                    } else {
                        isBubbleSort = false;
                        break;
                    }
                }
            }

            if (isBubbleSort) {
                break lo;
            }
        }

        return numbers;
    }
}