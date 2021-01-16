package chapter8;

import java.util.Scanner;

public class Exercise_08_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (intersectingPoint(points) != null) {
            double[] intersectingPoint = intersectingPoint(points);

            double[] areas = new double[4];

            areas[0] = triangleArea(intersectingPoint[0], intersectingPoint[1], points[0][0], points[0][1],
                    points[1][0], points[1][1]);
            areas[1] = triangleArea(intersectingPoint[0], intersectingPoint[1], points[1][0], points[1][1],
                    points[2][0], points[2][1]);
            areas[2] = triangleArea(intersectingPoint[0], intersectingPoint[1], points[2][0], points[2][1],
                    points[3][0], points[3][1]);
            areas[3] = triangleArea(intersectingPoint[0], intersectingPoint[1], points[0][0], points[0][1],
                    points[3][0], points[3][1]);

            lo: while (true) {
                // 遍历数组areas，如果数组前面的值大于后面的值则进行交换
                for (int i = 0; i < areas.length - 1; i++) {
                    double temp;
                    if (areas[i] > areas[i + 1]) {
                        temp = areas[i];
                        areas[i] = areas[i + 1];
                        areas[i + 1] = temp;
                    }
                }

                // 遍历数组areas，确保数组前面的数小于后面的数，否则重新进行交换，直到数组前面的数都小于后面的数
                boolean isSorted = true;
                for (int j = 0; j < areas.length - 1; j++) {
                    if (areas[j] > areas[j + 1]) {
                        isSorted = false;
                        break;
                    }
                }

                if (isSorted) {
                    break lo;
                }
            }

            // 打印数组areas中的每一个元素
            System.out.print("The areas are ");
            for (int i = 0; i < areas.length; i++) {
                System.out.printf("%.2f", areas[i]);
                if (i != areas.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        } else {
            System.out.println("The four points are on two parallel lines");
        }

        input.close();
    }

    // 返回交点的坐标
    public static double[] intersectingPoint(double[][] points) {
        double[] point = new double[2];

        double denominator = (points[0][1] - points[2][1]) * (points[3][0] - points[1][0])
                - (points[1][1] - points[3][1]) * (points[2][0] - points[0][0]);

        // 如果不等于0，表示数组中的点不在两条相互平行的直线上
        if (denominator != 0) {
            point[0] = (((points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1])
                    * (points[3][0] - points[1][0])
                    - ((points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1])
                            * (points[2][0] - points[0][0]))
                    / denominator;
            point[1] = (((points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1])
                    * (points[0][1] - points[2][1])
                    - ((points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1])
                            * (points[1][1] - points[3][1]))
                    / denominator;

            return point;
        } else {
            return null;
        }
    }

    // 计算三个点的面积
    public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double sideOne = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double sideTwo = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double sideThree = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

        double s = (sideOne + sideTwo + sideThree) / 2;

        double area = Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));

        // 如果三个点在一条直线上，则返回0
        if (Double.isNaN(area)) {
            return 0;
        }

        return area;
    }
}
