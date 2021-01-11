package chapter8;

import java.util.Random;

public class Exercise_08_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = new Random().nextInt(2);
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(
                "Each row of the matrix " + (evenNumberOf1OnRow(matrix) ? "has" : "don't has") + " even munber of 1");
        System.out.println("Each column of the matrix " + (evenNumberOf1OnColumn(matrix) ? "has" : "don't has")
                + " even mumber of 1");
    }

    public static boolean evenNumberOf1OnRow(int[][] matrix) {
        boolean isTrue = true;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }

    public static boolean evenNumberOf1OnColumn(int[][] matrix) {
        boolean isTrue = true;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }
}
