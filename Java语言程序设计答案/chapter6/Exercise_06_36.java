package chapter6;

import java.util.Scanner;

public class Exercise_06_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberSides = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the polygon is " + area(numberSides, side));

        input.close();
    }

    public static double area(int n, double side) {
        double areas = n * Math.pow(side, 2) / (4 * Math.tan(Math.PI / n));
        return areas;
    }
}