package chapter8;

import java.util.Random;
import java.util.Scanner;

public class Exercise_08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(2);
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

        rowOfSameNumbers(matrix);
        columnOfSameNumbers(matrix);
        majorDiagonalOfSameNumber(matrix);
        sub_diagonalOfSameNumber(matrix);

        input.close();
    }

    public static void rowOfSameNumbers(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            boolean isOk = true;
            lo: for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    continue;
                } else {
                    isOk = false;
                    break lo;
                }
            }

            if (isOk) {
                System.out.println("All " + matrix[i][0] + "s on row " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No same numbers on a row");
        }
    }

    public static void columnOfSameNumbers(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            boolean isOk = true;
            lo: for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[j][i] == matrix[j + 1][i]) {
                    continue;
                } else {
                    isOk = false;
                    break lo;
                }
            }

            if (isOk) {
                System.out.println("All " + matrix[0][i] + "s on column " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No same numbers on a column");
        }
    }

    public static void majorDiagonalOfSameNumber(int[][] matrix) {
        boolean isOk = true;
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][i] == matrix[i + 1][i + 1]) {
                continue;
            } else {
                isOk = false;
                break;
            }
        }

        if (isOk) {
            System.out.print("All " + matrix[0][0] + "s ");
        } else {
            System.out.print("No same numbers ");
        }

        System.out.println("on the major diagonal");
    }

    public static void sub_diagonalOfSameNumber(int[][] matrix) {
        boolean isOk = true;
        int column = matrix.length - 1;

        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][column] == matrix[i + 1][column - 1]) {
                column--;
            } else {
                isOk = false;
                break;
            }
        }

        if (isOk) {
            System.out.print("All " + matrix[0][matrix.length - 1] + "s ");
        } else {
            System.out.print("No same numbers ");
        }

        System.out.println("on the sub-diagonal");
    }
}
