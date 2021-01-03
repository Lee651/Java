package chapter2;

import java.util.Scanner;

public class Exercise_02_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the amout of water in kilograms: ");
        double waterWeight = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energy = waterWeight * (finalTemperature - initialTemperature) * 4184;
        
        System.out.println("The energy needer is " + energy);
        
        input.close();
    }
}