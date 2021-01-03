package chapter6;

import java.util.Scanner;

public class Exercise_06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = input.nextLong();

        System.out.print("The square root of " + n + " is ");
        System.out.printf("%.4f\n" ,sqrt(n));

        input.close();
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = 0;

        lo: while (true) {
            
            nextGuess = (lastGuess + n / lastGuess) / 2;
            
            if (Math.abs(lastGuess - nextGuess) >= 0.0001) {
                lastGuess = nextGuess;
            } else {
                break lo;
            }
        }
        return nextGuess;
    }
}