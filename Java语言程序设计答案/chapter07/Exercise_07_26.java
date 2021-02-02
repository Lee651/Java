package chapter07;

import java.util.Scanner;

public class Exercise_07_26 {
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

        System.out.println("Two lists are" + ((equals(list1, list2)) ? " " : " not ") + "strictly identical");

        input.close();
    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean isEqula = true;

        if (list1.length == list2.length) {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] == list2[i]) {
                    continue;
                } else {
                    isEqula = false;
                    break;
                }
            }
        } else {
            isEqula = false;
        }

        return isEqula;
    }
}