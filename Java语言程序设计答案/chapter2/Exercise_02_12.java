package chapter2;

import java.util.Scanner;

public class Exercise_02_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double acceleration = input.nextDouble();
        double speed = input.nextDouble();

        double minimunRunwayLength = acceleration * acceleration / (2 * speed);
        System.out.println("The minimun runway length for this airplane is " + minimunRunwayLength);

        input.close();
    }
}