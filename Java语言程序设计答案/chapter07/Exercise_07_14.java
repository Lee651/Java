package chapter07;

import java.util.Scanner;

public class Exercise_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The greatest common divisor is " + gcd(numbers));

        input.close();
    }

    public static int gcd(int... numbers) {
        int minimum = min(numbers);
        int maxCommonDivisor = 1;
        boolean isDivisor;

        for (int i = 2; i <= minimum; i++) {
            isDivisor = true;
            for (int e : numbers) {
                if (e % i != 0) {
                    isDivisor = false;
                }
            }

            if (isDivisor) {
                maxCommonDivisor = i;
            }
        }

        return maxCommonDivisor;
    }

    public static int min(int... numbers) {
        int minimum = numbers[0];

        for (int e : numbers) {
            if (e < minimum) {
                minimum = e;
            }
        }

        return minimum;
    }
}