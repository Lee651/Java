package chapter07;

import java.util.Scanner;

public class Exercise_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("The list is" + (isSorted(list) ? " " : " not ") + "sorted");

        input.close();
    }

    public static boolean isSorted(int[] list) {
        boolean isSort = true;

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] <= list[j]) {
                    continue;
                } else {
                    isSort = false;
                    break;
                }
            }
        }

        return isSort;
    }
}