package chapter3;

import java.util.Scanner;

public class Exercise_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the package weight: ");
        double weight = input.nextDouble();

        if (weight <= 1.0) {
            System.out.print("The transportation cost is 3.5 dollars");
        }else if (weight <= 3.0) {
            System.out.print("The transportation cost is 5.5 dollars");
        }else if (weight <= 10.0) {
            System.out.print("The transportation cost is 8.5 dollars");
        }else if (weight <= 20.0) {
            System.out.print("The transportation cost is 10.5 dollars");
        }else {
            System.out.print("the package cannot be shipped");
        } 

        input.close();
    }
}