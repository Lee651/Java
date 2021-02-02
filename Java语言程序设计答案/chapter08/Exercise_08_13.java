package chapter08;

import java.util.Scanner;

public class Exercise_08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rowsNumber = input.nextInt();
        int columnsNumber = input.nextInt();

        double[][] matrix = new double[rowsNumber][columnsNumber];

        System.out.println("Enter the array: ");
        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println("The location of the largest element is at (" + locateLargest(matrix)[0] + ", "
                + locateLargest(matrix)[1] + ")");

        input.close();
    }

    public static int[] locateLargest(double[][] matrix) {
        int[] index = { 0, 0 };
        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    index[0] = i;
                    index[1] = j;
                    max = matrix[i][j];
                }
            }
        }

        return index;
    }
}
