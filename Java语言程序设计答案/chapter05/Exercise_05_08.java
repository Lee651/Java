package chapter05;

import java.util.Scanner;

public class Exercise_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double highScore = 0;
        String highScoreName = "";

        System.out.print("Enter the students number: ");
        int number = input.nextInt();

        System.out.println("Enter each student's name and score: ");
        for (int i = 0; i < number; i++) {
            System.out.print("Student " + (i + 1) + " :" + "\nname: ");
            String name = input.next();

            System.out.print("score: ");
            double score = input.nextDouble();

            if (score > highScore) {
                highScore = score;
                highScoreName = name;
            }
        }

        System.out.println("Student with the highest score is: " + highScoreName);

        input.close();
    }
}