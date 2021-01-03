package chapter3;

import java.util.Scanner;

public class Exercise_03_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if (numberOfOneDollars >= 2) {
            System.out.println("\t" + numberOfOneDollars + " dollars");
        }else {
            System.out.println("\t" + numberOfOneDollars + " dollar");
        }

        if (numberOfQuarters >= 2) {
            System.out.println("\t" + numberOfQuarters + " quarters"); 
        }else {
            System.out.println("\t" + numberOfQuarters + " quarter");
        }
        
        if (numberOfDimes >= 2) {
            System.out.println("\t" + numberOfDimes + " dimes"); 
        }else {
            System.out.println("\t" + numberOfDimes + " dime");
        }

        if (numberOfNickels >= 2) {
            System.out.println("\t" + numberOfNickels + " nickels"); 
        }else {
            System.out.println("\t" + numberOfNickels + " nickel");
        }
        
        if (numberOfPennies >= 2) {
            System.out.println("\t" + numberOfPennies + " pennies"); 
        }else {
            System.out.println("\t" + numberOfPennies + " pennie");
        }
        input.close();
    }
}