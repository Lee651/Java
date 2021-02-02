package chapter02;

import java.util.Scanner;

public class Exercise_02_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double sideOne = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
        double sideTwo = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        double sideThree = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);

        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.pow(s * (s - sideOne) * (s - sideTwo) * (s - sideThree), 0.5);

        System.out.println("The area of the triangle is: " + area);

        input.close();
    }
}