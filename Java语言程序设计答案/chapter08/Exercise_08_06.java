package chapter08;

import java.util.Scanner;

public class Exercise_08_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];

        System.out.print("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        print(matrix1, matrix2, multiplyMatrix(matrix1, matrix2));

        input.close();
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] multiplyMatrixs = new double[a.length][a.length];

        for (int i = 0; i < multiplyMatrixs.length; i++) {
            for (int j = 0; j < multiplyMatrixs[i].length; j++) {
                multiplyMatrixs[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
            }
        }

        return multiplyMatrixs;
    }

    public static void print(double[][] a, double[][] b, double[][] multiplyMatrixs) {
        for (int i = 0; i < a.length; i++) {
            println(a, i);
            System.out.print((i == 1) ? "  *  " : "     ");
            println(b, i);
            System.out.print((i == 1) ? "  =  " : "     ");
            println(multiplyMatrixs, i);

            // 换行
            System.out.println();
        }
    }

    public static void println(double[][] m, int x) {
        for (int i = 0; i < m[x].length; i++) {
            System.out.print(" ");
            System.out.printf("%.1f", m[x][i]);
        }
    }
}