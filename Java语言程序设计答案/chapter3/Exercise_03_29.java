package chapter3;

import java.util.Scanner;

public class Exercise_03_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1_coordinates = input.nextDouble();
        double y1_coordinates = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2_coordinates = input.nextDouble();
        double y2_coordiantes = input.nextDouble();
        double radius2 = input.nextDouble();

        double centerDistance = Math.pow(Math.pow(x1_coordinates - x2_coordinates, 2) + Math.pow(y1_coordinates - y2_coordiantes, 2), 0.5);
        double radiusAdd = radius1 + radius2;
        double radiusSubtraction = Math.abs(radius1 - radius2);

        if (centerDistance > radiusAdd) {
            System.out.println("circle2 does not overlap circle1");
        }

        if (centerDistance <= radiusSubtraction) {
            System.out.println("circle2 is inside circle1");
        }

        if (radiusSubtraction < centerDistance &&  centerDistance < radiusAdd) {
            System.out.println("circle2 overlap circle1");
        }

        input.close();
    }
}