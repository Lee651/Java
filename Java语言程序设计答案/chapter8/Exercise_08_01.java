package chapter8;

import java.util.Scanner;

public class Exercise_08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter the number of columns: ");
        int columIndex = input.nextInt();

        System.out.println("Sum of the elements at column " + columIndex + " is " + sumColumn(matrix, columIndex));

        input.close();
    }

    public static double sumColumn(double[][] m, int columIndex) {

        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][columIndex];
        }

        return sum;
    }
}