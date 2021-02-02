package chapter05;

import java.util.Scanner;

public class Exercise_05_02 {
    public static void main(String[] args) {
        final int number_of_questions = 10;
        int correctCount = 0;
        int count = 0;

        long startTime = System.currentTimeMillis();

        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < number_of_questions) {
            int number1 = (int) (Math.random() * 15 + 1);
            int number2 = (int) (Math.random() * 15 + 1);

            System.out.print("What is " + number1 + " + " + number2 + " ? ");

            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("you are corrent!");
                correctCount++;
            } else {
                System.out.println(
                        "Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
            }
            count++;
            output += "\n" + number1 + " + " + number2 + " = " + answer + " "
                    + ((number1 + number2 == answer) ? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println(
                "correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);

        input.close();
    }
}