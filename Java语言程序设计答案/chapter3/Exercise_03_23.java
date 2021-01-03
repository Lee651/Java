package chapter3;

import java.util.Scanner;

public class Exercise_03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.print("Point (" + x + ", " + y + ") is");
        if (Math.abs(x) <= 5.0 && Math.abs(y) <= 2.5) {
            System.out.print("");
        }else {
            System.out.print(" not");
        }
        System.out.print(" in the rectangle");
        input.close();
    }
}