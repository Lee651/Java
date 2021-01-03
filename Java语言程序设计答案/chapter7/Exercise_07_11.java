package chapter7;

import java.util.Scanner;

public class Exercise_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] x = new double[10];

        for (int i = 0; i < 10; i++) {
            x[i] = input.nextDouble();
        }

        System.out.print("The mean is ");
        System.out.printf("%.2f\n", mean(x));
        System.out.print("The standard deviation is ");
        System.out.printf("%.5f\n", deviation(x));

        input.close();
    }

    public static double deviation(double[] x) {
        double average = mean(x);
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - average, 2);
        }

        return Math.sqrt(sum / (x.length - 1));
    }

    public static double mean(double[] x) {
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum / x.length;
    }
}