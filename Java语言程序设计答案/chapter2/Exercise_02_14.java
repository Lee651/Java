package chapter2;

import java.util.Scanner;

public class Exercise_02_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * 0.45359237;

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble() * 0.0254;

        double BMI = weight / (height * height);

        System.out.println("BMI is " + BMI);

        input.close();
    }
}