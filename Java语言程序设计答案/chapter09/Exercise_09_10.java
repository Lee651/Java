package chapter09;

import java.util.Scanner;

public class Exercise_09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("r1: " + quadraticEquation.getRoot1() + ", r2: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("r: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

        input.close();
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double A, double B, double C) {
        a = A;
        b = B;
        c = C;
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

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return 0;
        }
    }
}