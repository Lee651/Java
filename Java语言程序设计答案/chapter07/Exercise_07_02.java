package chapter07;

import java.util.Scanner;

public class Exercise_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers: ");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(arr[j]);
            } else {
                System.out.print(arr[j] + " ");
            }
        }

        input.close();
    }
}