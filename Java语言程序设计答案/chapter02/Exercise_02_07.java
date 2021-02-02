package chapter02;

import java.util.Scanner;

public class Exercise_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minures: ");
        long minutes = input.nextLong();

        long years = minutes / (60 * 24 * 365);
        long days = (minutes - years * 365 * 24 * 60) / (60 * 24);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

        input.close();
    }
}