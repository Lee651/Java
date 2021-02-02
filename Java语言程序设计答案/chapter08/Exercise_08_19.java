package chapter08;

import java.util.Scanner;

public class Exercise_08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in a two-dimensional array: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns in a two-dimensional array: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println(isConsecutiveFour(matrix));

        input.close();
    }

    public static boolean isConsecutiveFour(int[][] values) {

        if (isConsecutiveFourOnRow(values) || isConsecutiveFourOnColumn(values)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isConsecutiveFourOnRow(int[][] values) {
        boolean consecutiveFourOnRow = false;

        for (int i = 0; i < values.length; i++) {

            int count = 0;

            for (int j = 0; j < values[i].length - 3; j++) {
                for (int k = j + 1; k < values[i].length; k++) {
                    if (values[i][j] == values[i][k]) {
                        count++;
                    }
                }

                if (count >= 4) {
                    consecutiveFourOnRow = true;
                    break;
                }
            }
        }

        return consecutiveFourOnRow;
    }

    public static boolean isConsecutiveFourOnColumn(int[][] values) {
        boolean consecutiveFourOnColumn = false;
        int rows = values.length;
        int columns = values[0].length;

        for (int i = 0; i < columns; i++) {

            int count = 0;

            for (int j = 0; j < rows - 3; j++) {
                for (int k = j + 1; k < rows; k++) {
                    if (values[j][i] == values[k][i]) {
                        count++;
                    }
                }

                if (count >= 4) {
                    consecutiveFourOnColumn = true;
                    break;
                }
            }
        }

        return consecutiveFourOnColumn;
    }
}
