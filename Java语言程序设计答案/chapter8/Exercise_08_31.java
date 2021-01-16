package chapter8;

import java.util.Scanner;

public class Exercise_08_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] points = new double[4][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        if (getIntersectingPoint(points) == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at (" + getIntersectingPoint(points)[0] + ", "
                    + getIntersectingPoint(points)[1] + ")");
        }

        input.close();
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] intersectingPoint = new double[2];

        double denominator = (points[0][1] - points[1][1]) * (points[3][0] - points[2][0])
                - (points[2][1] - points[3][1]) * (points[1][0] - points[0][0]);

        if (denominator == 0) {
            return null;
        } else {
            intersectingPoint[0] = (((points[0][1] - points[1][1]) * points[0][0]
                    - (points[0][0] - points[1][0]) * points[0][1]) * (points[3][0] - points[2][0])
                    - ((points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1])
                            * (points[1][0] - points[0][0]))
                    / denominator;
            intersectingPoint[1] = (((points[2][1] - points[3][1]) * points[2][0]
                    - (points[2][0] - points[3][0]) * points[2][1]) * (points[0][1] - points[1][1])
                    - ((points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1])
                            * (points[2][1] - points[3][1]))
                    / denominator;

            return intersectingPoint;
        }
    }
}
