package chapter08;

import java.util.Scanner;

public class Exercise_08_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[3][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (getTriangleArea(points) == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.println("The area of the triangle is " + getTriangleArea(points));
        }

        input.close();
    }

    public static double getTriangleArea(double[][] points) {
        double sideOne = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2) + Math.pow(points[0][1] - points[1][1], 2));
        double sideTwo = Math.sqrt(Math.pow(points[0][0] - points[2][0], 2) + Math.pow(points[0][1] - points[2][1], 2));
        double sideThree = Math
                .sqrt(Math.pow(points[1][0] - points[2][0], 2) + Math.pow(points[1][1] - points[2][1], 2));

        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));

        if (Double.isNaN(area)) {
            return 0;
        }

        return area;
    }
}
