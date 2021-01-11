package chapter8;

import java.util.Scanner;

public class Exercise_08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number of cities: ");
        int numberCities = input.nextInt();

        double[][] points = new double[numberCities][2];

        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < numberCities; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        System.out.println("The central city is at (" + points[centralCityPoint(allDistance(points))][0] + ", "
                + points[centralCityPoint(allDistance(points))][1] + ")");
        System.out.print("The total distance to all other cities is ");
        System.out.printf("%.2f\n", allDistance(points)[centralCityPoint(allDistance(points))][1]);

        input.close();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double[][] allDistance(double[][] points) {
        double[][] point = new double[points.length][2];

        for (int i = 0; i < points.length; i++) {
            double allDistance = 0;
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    allDistance += distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                }
            }

            point[i][0] = i;
            point[i][1] = allDistance;
        }

        return point;
    }

    public static int centralCityPoint(double[][] point) {
        int index = 0;
        double shortestDistance = point[0][1];

        for (int i = 1; i < point.length; i++) {
            if (point[i][1] < shortestDistance) {
                index = i;
            }
        }

        return index;
    }
}
