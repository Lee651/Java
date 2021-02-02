package chapter05;

import java.util.Scanner;

public class Exercise_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double highestScore = 0, secondHighScore = 0;
        String name1 = "", name2 = "";

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("Student " + (i + 1) + " :" + "\nname: ");
            String name = input.next();

            System.out.print("score: ");
            double score = input.nextDouble();

            if (number == 1) {
                highestScore = score;
                name1 = name;
            } else if (number == 0) {

            } else if (number > 1 && score > highestScore && score > secondHighScore) {
                secondHighScore = highestScore;
                name2 = name1;
                highestScore = score;
                name1 = name;
            } else if (number > 1 && score > secondHighScore) {
                name2 = name;
                secondHighScore = score;
            }
        }

        System.out.println("The highest score student is " + name1 + ", the second high score student is " + name2);
        input.close();
    }
}