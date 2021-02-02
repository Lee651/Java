package chapter03;

import java.util.Scanner;

public class Exercise_03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double discriminant = a * d - b * c;

        if (discriminant != 0) {
            double x = (e * d - b * f) / discriminant;
            double y = (a * f - e * c) / discriminant;

            System.out.println("x is " + x + " and " + "y is " + y);
        } else {
            System.out.println("The equation has no solution");
        }

        input.close();
    }
}