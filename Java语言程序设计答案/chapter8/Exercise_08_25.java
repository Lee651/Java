package chapter8;

import java.util.Scanner;

public class Exercise_08_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println("It is" + (isMarkovMatrix(matrix) ? " " : " not ") + "a Markov matrix");

        input.close();
    }

    public static boolean isMarkovMatrix(double[][] m) {
        boolean markovMatrix = true;

        for (int i = 0; i < m.length; i++) {
            double sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                // 判断矩阵中的每一个元素是否是整数，如果是就继续遍历，否则直接退出循环
                if (m[j][i] <= 0) {
                    markovMatrix = false;
                    break;
                }

                sum += m[j][i];
            }

            System.out.println(sum);

            // 每一列遍历结束后，判断该列的和是否等于1，如果等于，则继续遍历后面的列，否则直接退出循环
            if (sum != 1.0) {
                markovMatrix = false;
                break;
            }
        }

        return markovMatrix;
    }
}
