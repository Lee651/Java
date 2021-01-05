package chapter8;

import java.util.Scanner;

public class Exercise_08_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int number = input.nextInt();

        double[][] points = new double[number][2];

        System.out.print("Enter " + number + " points: ");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j < number; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (distance <= shortestDistance) {
                    System.out.println("The closest two points are (" + points[i][0] + ", " + points[i][1] + ") and ("
                            + points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }

        input.close();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
