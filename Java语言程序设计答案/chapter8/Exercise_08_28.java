package chapter8;

import java.util.Scanner;

public class Exercise_08_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] m1 = new int[3][3];

        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        int[][] m2 = new int[3][3];

        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        System.out.println("The two arrays are" + (equals(m1, m2) ? " " : " not ") + "strictly identical");

        input.close();
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean isEquals = true;

        // 判断数组m1中的每一个数和数组m2中的每一个数是否相等
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    isEquals = false;
                    break;
                }
            }
        }

        return isEquals;
    }
}
