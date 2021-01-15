package chapter8;

import java.util.Scanner;

public class Exercise_08_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println();

        System.out.println("The Column-sorted array is");
        for (int i = 0; i < sortColumn(matrix).length; i++) {
            for (int j = 0; j < sortColumn(matrix)[i].length; j++) {
                System.out.print(sortColumn(matrix)[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }

    public static double[][] sortColumn(double[][] m) {
        lo: while (true) {
            // 遍历每一列，如果前面的数大于后面的数，则进行交换
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length - 1; j++) {
                    double tem;
                    if (m[j][i] > m[j + 1][i]) {
                        tem = m[j][i];
                        m[j][i] = m[j + 1][i];
                        m[j + 1][i] = tem;
                    }
                }
            }

            // 判断交换完的数组中每列的前一个数是否小于后面的数，如果是，则继续遍历后面的列，否则直接退出循环，重新进入交换循环中
            boolean isSorted = true;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length - 1; j++) {
                    if (m[j][i] > m[j + 1][i]) {
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
