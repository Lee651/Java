package chapter3;

import java.util.Scanner;

public class Exercise_03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);

        System.out.print("Point (" + x + ", " + y + ") is");
        if (distance <= 10.0) {
            System.out.print("");
        }else {
            System.out.print(" not");
        }
        System.out.print(" in the circle");
        input.close();
    }
}