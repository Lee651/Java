package chapter8;

import java.util.Scanner;

public class Exercise_08_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[6][2];

        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        System.out.println("The rightmost lowest point is (" + getRightmostLowestPoint(points)[0] + ", "
                + getRightmostLowestPoint(points)[1] + ")");

        input.close();
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        // 先假定最右下角的点是数组中的第一个点
        double[] rightmostLowestPoint = points[0];

        for (int i = 1; i < points.length; i++) {
            // 遍历数组，如果遍历出的y值小于假定的第一个点的y值，则进行交换
            if (points[i][1] < rightmostLowestPoint[1]) {
                rightmostLowestPoint = points[i];
            }

            // 如果遍历出的y值等于rightmostLowestPoint的y值，则比较x值，若遍历出的x的值大于rightmostLowestPoint的x值，则进行交换
            if (points[i][1] == rightmostLowestPoint[1]) {
                if (points[i][0] > rightmostLowestPoint[0]) {
                    rightmostLowestPoint = points[i];
                }
            }
        }

        return rightmostLowestPoint;
    }
}
