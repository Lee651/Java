package chapter08;

import java.util.Random;

public class Exercise_08_10 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = new Random().nextInt(2);
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

        System.out.println("The largest row index: " + largestRow(numbers));
        System.out.println("The largest column index: " + largestColumn(numbers));
    }

    public static int largestRow(int[][] numbers) {
        int rowMax = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == 1) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                rowMax = i;
            }
        }

        return rowMax;
    }

    public static int largestColumn(int[][] numbers) {
        int columnMax = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[j][i] == 1) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                columnMax = i;
            }
        }

        return columnMax;
    }
}
