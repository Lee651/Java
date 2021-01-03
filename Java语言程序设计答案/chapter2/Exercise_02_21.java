package chapter2;

import java.util.Scanner;

public class Exercise_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();
       
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double accumulValue = investmentAmount * Math.pow(1.0 + (annualInterestRate / 1200), years * 12);

        System.out.println("Accumulated value is " + accumulValue);

        input.close();
    }
}