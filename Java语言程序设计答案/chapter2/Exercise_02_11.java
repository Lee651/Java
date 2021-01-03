package chapter2;

import java.util.Scanner;

public class Exercise_02_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        long population = ((365 * 24 * 3600) / 7 + (365 * 24 * 3600) / 45 - (365 * 24 * 3600) / 13) * years + 312032486;
        
        System.out.println("The population in " + years + " is: " + population);

        input.close();
    }
}