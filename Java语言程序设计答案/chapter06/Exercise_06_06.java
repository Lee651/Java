package chapter06;

import java.util.Scanner;

public class Exercise_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        displayPattern(number);

        input.close();
    }

    public static void displayPattern(int n) {

        for (int i = 1; i <= n; i++) {
            int j = (n - i) * 2;
            int l = 0;

            while (l < j) {
                System.out.print(" ");
                l++;
            }

            int k = i;
            while (1 <= k) {
                if (k == 1) {
                    System.out.println(k);
                } else {
                    System.out.print(k + " ");
                }
                k--;
            }
        }
    }
}