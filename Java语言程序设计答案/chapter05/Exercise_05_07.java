package chapter05;

import java.util.Scanner;

public class Exercise_05_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter this year's tuition: ");
        double tuitions = input.nextDouble();

        System.out.print("Enter the annual growth rate: ");
        double annualGrowthRate = input.nextDouble();

        System.out.print("Enter how many years later: ");
        int years = input.nextInt();

        double tuitionsTenYear = 0;
        double tuitionOfFourYears = 0;

        for (int i = 0; i < years + 4; i++) {
            tuitions *= (1 + annualGrowthRate);
            if (i > 9) {
                tuitionOfFourYears += tuitions;
            }
            if (i == 9) {
                tuitionsTenYear = tuitions;
            }
        }

        System.out.println("Tuition in ten years: " + "$" + tuitionsTenYear);
        System.out.println("Total cost for four years's worth of tuition after the tenth year: $" + tuitionOfFourYears);

        input.close();
    }
}