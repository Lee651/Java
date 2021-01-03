package chapter7;

import java.util.Scanner;

public class Exercise_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for (int j = 0; j < list2.length; j++) {
            list2[j] = input.nextInt();
        }

        System.out.print("The merged list is");
        for (int e : merge(list1, list2)) {
            System.out.print(" " + e);
        }

        System.out.println();

        input.close();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int len = list1.length + list2.length;
        int[] list = new int[len];

        for (int i = 0; i < list1.length; i++) {
            list[i] = list1[i];
        }

        for (int j = 0; j < list2.length; j++) {
            list[j + list1.length] = list2[j];
        }

        for (int k = len - 1; k >= 0; k--) {
            int tem;
            for (int l = 0; l < k; l++) {
                if (list[l] > list[k]) {
                    tem = list[l];
                    list[l] = list[k];
                    list[k] = tem;
                }
            }
        }

        return list;
    }
}