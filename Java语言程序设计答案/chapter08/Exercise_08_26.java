package chapter08;

import java.util.Scanner;

public class Exercise_08_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println();

        System.out.println("The row-sorted array is ");
        for (int i = 0; i < sortRows(matrix).length; i++) {
            for (int j = 0; j < sortRows(matrix)[i].length; j++) {
                System.out.print(sortRows(matrix)[i][j] + " ");
            }

            System.out.println();
        }

        input.close();
    }

    public static double[][] sortRows(double[][] m) {
        lo: while (true) {
            // 遍历每一行，如果前面的数大于后面的数，则进行交换
            for (int i = 0; i < m.length; i++) {
                double tem;
                for (int j = 0; j < m[i].length - 1; j++) {
                    if (m[i][j] > m[i][j + 1]) {
                        tem = m[i][j];
                        m[i][j] = m[i][j + 1];
                        m[i][j + 1] = tem;
                    }
                }
            }

            // 判断交换完的数组中每行的前一个数是否小于后面的数，如果是，则继续遍历后面的行，否则直接退出循环，重新进入交换循环中
            boolean isSorted = true;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length - 1; j++) {
                    if (m[i][j] > m[i][j + 1]) {
                        isSorted = false;
                        break;
                    }
                }
            }

            if (isSorted) {
                break lo;
            }
        }

        return m;
    }
}
