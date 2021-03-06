package chapter04;

import java.util.Scanner;

public class Exercise_04_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = 6 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 6));
        System.out.println(Math.PI / 6);

        System.out.printf("The area of the hexagon is %5.2f\n", area);

        input.close();
    }
}