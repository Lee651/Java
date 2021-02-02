package chapter08;

import java.util.Scanner;

public class Exercise_08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] a = new double[2][2];
        double[] b = new double[2];

        System.out.print("Enter a00, a01, a10, a11, b0, b1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }

        if (linearEquation(a, b) != null) {
            System.out.println("x is " + linearEquation(a, b)[0] + " and y is " + linearEquation(a, b)[1]);
        } else {
            System.out.println("The equation has no solution");
        }

        input.close();
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] results = new double[2];

        double denominator = a[0][0] * a[1][1] - a[0][1] * a[1][0];

        if (denominator != 0) {
            results[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / denominator;
            results[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / denominator;
            return results;
        } else {
            return null;
        }
    }
}
