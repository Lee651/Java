package chapter04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_04_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalRate = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateRate = input.nextDouble();

        DecimalFormat df = new java.text.DecimalFormat("0.00");

        double grossPay = hours * payRate;
        double federalWithholding = grossPay * federalRate;
        double stateWithholding = grossPay * stateRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + "$" + payRate);
        System.out.println("Gross Pay: " + "$" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("  Federal withholding (20.0%): $" + federalWithholding);
        System.out.println("  State Withholding (9.0%): $" + df.format(stateWithholding));
        System.out.println("  Total Deductions: $" + df.format(totalDeduction));
        System.out.println("Net Pay: $" + df.format(netPay));

        input.close();
    }
}