package chapter7;

import java.util.Scanner;

public class Exercise_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int[] numbers = new int[number];

        System.out.print("Enter " + number + " scores: ");
        for (int i = 0; i < number; i++) {
            numbers[i] = input.nextInt();
        }

        double best = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > best) {
                best = numbers[j];
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Student " + i + " score is " + numbers[i] + " and grade is ");
            if (numbers[i] >= best - 10) {
                System.out.println("A");
            } else if (numbers[i] >= best - 20) {
                System.out.println("B");
            } else if (numbers[i] >= best - 30) {
                System.out.println("C");
            } else if (numbers[i] >= best - 40) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

        input.close();
    }
}