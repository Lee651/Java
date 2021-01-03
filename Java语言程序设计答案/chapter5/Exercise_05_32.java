package chapter5;

import java.util.Scanner;

public class Exercise_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lotteryDigit1, lotteryDigit2;

        lotteryDigit1 = (int) (Math.random() * 10); 

        do {
            lotteryDigit2 = (int) (Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);

        System.out.print("Enter your lottery pick(two digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Exact match: you win $10000");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match all digits: you win S3000");
        } else if (guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit1 ||
        guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1000");
        } else {
            System.out.println("sorry, no match");
        }

        input.close();
    }
}