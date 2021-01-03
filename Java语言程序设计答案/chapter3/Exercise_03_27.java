package chapter3;

import java.util.Scanner;

public class Exercise_03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x_coordinates = input.nextDouble();
        double y_coordinates = input.nextDouble();

        boolean result = x_coordinates >= 0 && y_coordinates >= 0 && y_coordinates <= 100 - 0.5 * x_coordinates;

        System.out.print("The point is");
        if (result) {
            System.out.print(" ");
        }else {
            System.out.print(" not ");
        }

        System.out.print("in the triangle");

        input.close();
    }
}