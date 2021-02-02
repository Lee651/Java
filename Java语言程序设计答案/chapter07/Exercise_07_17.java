package chapter07;

import java.util.Scanner;

public class Exercise_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int studentsNumber = input.nextInt();

        String[] studentsName = new String[studentsNumber];
        System.out.print("Enter student name: ");
        for (int i = 0; i < studentsNumber; i++) {
            studentsName[i] = input.next();
        }

        double[] scores = new double[studentsNumber];
        System.out.print("Enter student scores: ");
        for (int j = 0; j < studentsNumber; j++) {
            scores[j] = input.nextDouble();
        }

        System.out.print("In order of achievement is:");
        for (String name : descendingOrder(scores, studentsName)) {
            System.out.print(" " + name);
        }

        System.out.println();

        input.close();
    }

    public static String[] descendingOrder(double[] scores, String[] studentsName) {
        double temScore;
        String temName;

        lo: while (true) {
            boolean isMax = false;
            for (int i = 0; i < scores.length - 1; i++) {
                if (scores[i] < scores[i + 1]) {
                    temScore = scores[i + 1];
                    scores[i + 1] = scores[i];
                    scores[i] = temScore;

                    temName = studentsName[i + 1];
                    studentsName[i + 1] = studentsName[i];
                    studentsName[i] = temName;
                }
            }

            for (int j = 1; j < scores.length; j++) {
                if (scores[0] >= scores[j]) {
                    isMax = true;
                } else {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                break lo;
            }
        }

        return studentsName;
    }
}