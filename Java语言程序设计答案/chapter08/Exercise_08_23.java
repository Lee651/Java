package chapter08;

import java.util.Scanner;

public class Exercise_08_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[6][6];

        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The flipped cell is at (" + flipCell(matrix)[0] + ", " + flipCell(matrix)[1] + ")");

        input.close();
    }

    public static int[] flipCell(int[][] matrix) {
        int[] point = new int[2];
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                point[0] = i;
                break;
            }
        }

        for (int i = 0; i < columns; i++) {
            int count = 0;
            for (int j = 0; j < rows; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                point[1] = i;
                break;
            }
        }

        return point;
    }
}
