package chapter06;

import java.util.Scanner;

public class Exercise_06_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.println("The area of the triangle is " + area(side1, side2, side3));
        } else {
            System.out.println("Invalid Input");
        }

        input.close();
    }

    public static boolean isValid(double side1, double side2, double side3) {
        return (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)) ? true : false;
    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double areas = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return areas;
    }
}