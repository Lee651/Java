package chapter9;

import java.util.Scanner;

public class Exercise_09_12 {
    public static void main(String[] args) {
        double[][] points = getPoints();

        double[] p = getArguments(points);

        LinearEquation intersectingPoint = new LinearEquation(p[0], p[1], p[2], p[3], p[4], p[5]);

        if (intersectingPoint.isSolvable()) {
            System.out.println("The intersecting point is at (" + intersectingPoint.getX() + ", "
                    + intersectingPoint.getY() + ")");
        } else
            System.out.println("The two lines are parallel");
    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }

        input.close();

        return points;
    }

    public static double[] getArguments(double[][] points) {
        double[] p = new double[6];
        p[0] = points[0][1] - points[1][1];
        p[1] = -1 * (points[0][0] - points[1][0]);
        p[2] = points[2][1] - points[3][1];
        p[3] = -1 * (points[2][0] - points[3][0]);
        p[4] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        p[5] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        return p;
    }
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getf() {
        return f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}