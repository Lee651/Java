package chapter03;

import java.util.Scanner;

public class Exercise_03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1_x_coordinates = input.nextDouble();
        double r1_y_coordinates = input.nextDouble();
        double r1_width = input.nextDouble();
        double r1_height = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2_x_coordinates = input.nextDouble();
        double r2_y_coordinates = input.nextDouble();
        double r2_width = input.nextDouble();
        double r2_height = input.nextDouble();

        double r1_x_max = r1_x_coordinates + 0.5 * r1_width;
        double r1_x_min = r1_x_coordinates - 0.5 * r1_width;
        double r1_y_max = r1_y_coordinates + 0.5 * r1_height;
        double r1_y_min = r1_y_coordinates - 0.5 * r1_height;

        double r2_x_max = r2_x_coordinates + 0.5 * r2_width;
        double r2_x_min = r2_x_coordinates - 0.5 * r2_width;
        double r2_y_max = r2_y_coordinates + 0.5 * r2_height;
        double r2_y_min = r2_y_coordinates - 0.5 * r2_height;

        if (r1_x_min <= r2_x_min && r1_x_max >= r2_x_max && r1_y_min <= r2_y_min && r1_y_max >= r2_y_max) {
            System.out.println("r2 is inside r1");
        } else if (r2_x_min > r1_x_max || r2_x_max < r1_x_min || r2_y_min > r1_y_max || r2_y_max < r1_y_min) {
            System.out.println("r2 does not overlap r1");
        } else {
            System.out.println("r2 overlap r1");
        }

        input.close();
    }
}