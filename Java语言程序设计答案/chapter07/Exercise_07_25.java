package chapter07;

import java.util.Scanner;

public class Exercise_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];

        System.out.print("Enter a, b and c: ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        solveQuadratic(eqn);

        input.close();
    }

    public static void solveQuadratic(double[] eqn) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double x1, x2;

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The equation has two roots " + x1 + " and " + x2);
        } else if (discriminant == 0) {
            x1 = x2 = (-b) / (2 * a);

            System.out.println("The equation has one root " + x1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}