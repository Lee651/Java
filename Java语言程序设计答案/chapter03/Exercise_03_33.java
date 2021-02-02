package chapter03;

import java.util.Scanner;

public class Exercise_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        System.out.println((price1 / weight1 > price2 / weight2) ? "Package 2 has a better price."
                : ((price1 / weight1 == price2 / weight2) ? "Two packages have the same price."
                        : "Package 1 has a better price."));

        input.close();
    }
}