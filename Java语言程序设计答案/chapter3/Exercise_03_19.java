package chapter3;

import java.util.Scanner;

public class Exercise_03_19 {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);

        System.out.print("Enter the length of three sides: ");
        double a = innput.nextDouble();
        double b = innput.nextDouble();
        double c = innput.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Input is invalid.");
        }else {
            double perimeter = a + b + c;
            System.out.println("The perimter is " + perimeter);
        }

        innput.close();
    }
}
