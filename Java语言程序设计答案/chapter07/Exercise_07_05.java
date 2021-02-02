package chapter07;

import java.util.Scanner;

public class Exercise_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];
        int number;
        int count = 0;

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            number = input.nextInt();

            if (isDistinctNumber(arr, number)) {
                arr[count] = number;
                count++;
            }
        }

        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are: ");
        for (int k = 0; k < count; k++) {
            if (k == count - 1) {
                System.out.println(arr[k]);
            } else {
                System.out.print(arr[k] + " ");
            }
        }

        input.close();
    }

    public static boolean isDistinctNumber(int[] arr, int number) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == number) {
                return false;
            }
        }
        return true;
    }
}