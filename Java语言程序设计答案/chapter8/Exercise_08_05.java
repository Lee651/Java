package chapter8;

import java.util.Scanner;

public class Exercise_08_05 {
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

        System.out.println("The matrices are added as follows");
        print(matrix1, matrix2, addMatrix(matrix1, matrix2));

        input.close();
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] matrices = new double[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                matrices[i][j] = a[i][j] + b[i][j];
            }
        }

        return matrices;
    }

    public static void print(double[][] a, double[][] b, double[][] matrices) {
        for (int i = 0; i < a.length; i++) {
            println(a, i);
            System.out.print((i == 1 ? "  +  " : "     "));
            println(b, i);
            System.out.print((i == 1 ? "  =  " : "     "));
            println(matrices, i);

            // 换行
            System.out.println();
        }
    }

    public static void println(double[][] m, int x) {
        for (int i = 0; i < m[x].length; i++) {
            System.out.print(" " + m[x][i]);
        }
    }
}