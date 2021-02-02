package chapter07;

import java.util.Scanner;

public class Exercise_07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers of double type: ");
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The average of ten numbers is " + average(array));

        input.close();
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int ave = sum / array.length;

        return ave;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double ave = sum / array.length;
        return ave;
    }
}