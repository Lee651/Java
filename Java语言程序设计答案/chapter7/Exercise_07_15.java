package chapter7;

import java.util.Scanner;

public class Exercise_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.print("The distinct numbers are: ");
        for (int e : eliminateDuplicates(list)) {
            if (e > 0) {
                System.out.println(e);
            }
        }
      
        input.close();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int count = 0;
        int[] arr = new int[10];
        int i = 0;

        while (i < list.length) {
            boolean isHaving = true;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != list[i]) {
                    isHaving = false;
                } else {
                    isHaving = true;
                    break;
                }
            }

            if (!isHaving) {
                arr[count] = list[i];
                count++;
            }

            i++;
        }

        return arr;
    }
}