package chapter04;

import java.util.Scanner;

public class Exercise_04_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of bounding circle: ");
        double radius = input.nextDouble();

        double x1 = radius * Math.cos(Math.PI / 10);
        double y1 = radius * Math.sin(Math.PI / 10);

        double x2 = 0;
        double y2 = radius;

        double x3 = -radius * Math.cos(Math.PI / 10);
        double y3 = radius * Math.sin(Math.PI / 10);

        double x4 = -radius * Math.sin(Math.PI / 5);
        double y4 = -radius * Math.cos(Math.PI / 5);

        double x5 = radius * Math.sin(Math.PI / 5);
        double y5 = -radius * Math.cos(Math.PI / 5);

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");
        System.out.println("(" + x5 + ", " + y5 + ")");

        input.close();
    }
}