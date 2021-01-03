package chapter2;

import java.util.Scanner;

public class Exercise_02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        
        System.out.print("Enter miles per gallon: ");
        double milesGallon = input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double priceGallon = input.nextDouble();

        double cost = drivingDistance / milesGallon * priceGallon;

        System.out.println("The cost of driving is " + cost);

        input.close();
    }
}