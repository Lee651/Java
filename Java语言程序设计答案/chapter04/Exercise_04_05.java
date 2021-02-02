package chapter04;

import java.util.Scanner;

public class Exercise_04_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int sidesNumber = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = sidesNumber * Math.pow(side, 2) / (4 * Math.tan(Math.PI / sidesNumber));

        System.out.println("The area of the polygon is: " + area);

        input.close();
    }
}