package chapter03;

import java.util.Scanner;

public class Exercise_03_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        double weightInKilograms = weight * 0.45359237;
        double inchesInMeters = (inches + feet * 12) * 0.0254;
        double bmi = weightInKilograms / Math.pow(inchesInMeters, 2);

        System.out.print("bmi is " + bmi + ", ");

        if (bmi < 18.5) {
            System.out.print("Underweight");
        } else if (bmi < 25) {
            System.out.print("Normal");
        } else if (bmi < 30) {
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }
        input.close();
    }
}