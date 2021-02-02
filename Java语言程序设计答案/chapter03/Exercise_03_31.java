package chapter03;

import java.util.Scanner;

public class Exercise_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int DollarToRMB = input.nextInt();

        switch (DollarToRMB) {
            case 0:
                System.out.print("Enter the dollar amount: ");
                double DollarAmount = input.nextDouble();

                double RMB = DollarAmount * exchangeRate;
                System.out.println("$" + DollarAmount + " is " + RMB + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                double RMBAmount = input.nextDouble();

                double Dollar = RMBAmount / exchangeRate;
                System.out.println(RMBAmount + " yuan is $" + Dollar);
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }

        input.close();
    }
}