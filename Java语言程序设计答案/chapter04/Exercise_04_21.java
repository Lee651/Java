package chapter04;

import java.util.Scanner;

public class Exercise_04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String SSN = input.nextLine();

        // System.out.print(SSN + " is ");

        // if (SSN.contains("-")) {
        // if (SSN.length() == 11) {
        // String[] arrs = SSN.split("-");
        // if (arrs[0].length() == 3 && arrs[1].length() == 2) {
        // System.out.print("a valid");
        // } else {
        // System.out.print("an invalid");
        // }
        // } else {
        // System.out.print("an invalid");
        // }
        // } else {
        // System.out.print("an invalid");
        // }
        // System.out.println(" social security number");

        System.out.print(SSN + " is ");
        if (SSN.length() == 11 && SSN.charAt(3) == '-' && SSN.charAt(6) == '-') {
            System.out.print("a valid");
        } else {
            System.out.print("an invalid");
        }
        System.out.println(" social security number");

        input.close();
    }
}