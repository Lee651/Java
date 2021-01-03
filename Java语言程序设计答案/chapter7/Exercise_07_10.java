package chapter7;

import java.util.Scanner;

public class Exercise_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The index of the smallest number is " + indexOfSmallestElement(array));

        input.close();
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}