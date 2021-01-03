package chapter6;

import java.util.Scanner;

public class Exercise_06_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200.0;

        int years = 30;

        System.out.println("Years     Future Value");

        for (int i = 1; i <= years; i++) {
            System.out.printf("%-10d%11.2f\n", i, futureInvertmentValue(investmentAmount, monthlyInterestRate, i));
        }
        
        input.close();
    }


    public static double futureInvertmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }
}
