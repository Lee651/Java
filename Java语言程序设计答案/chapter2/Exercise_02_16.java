package chapter2;

import java.util.Scanner;

public class Exercise_02_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();

        double area = (Math.pow(3, 0.5) * 3 / 2) * Math.pow(sideLength, 2);

        System.out.println("The area of the hexagon is: " + area);

        input.close();
    }
}