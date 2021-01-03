package chapter7;

import java.util.Scanner;

public class Exercise_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten number: ");
        double[] array = new double[10];

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The minimum number is: " + min(array));

        input.close();
    }

    public static double min(double[] array) {
        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}