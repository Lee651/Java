package chapter8;

import java.util.Scanner;

public class Exercise_08_29 {
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

        System.out.println("The two arrays art" + (equals(m1, m2) ? " " : " not ") + "identical");

        input.close();
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean isEquals = true;

        int[] list1 = new int[m1.length * m1[0].length];
        int[] list2 = new int[m2.length * m2[0].length];
        int count = 0;

        // 将二维数组转化为一维数组
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                list1[count] = m1[i][j];
                list2[count] = m2[i][j];
                count++;
            }
        }

        // 每遍历数组1中的一个元素时，数组2则全部遍历，如果能找到对应的数组1中的元素，则继续遍历数组1，如果找不到，则直接退出循环
        lo1: for (int i = 0; i < list1.length; i++) {

            boolean isOk = true;

            lo2: for (int j = 0; j < list2.length; j++) {
                if (list1[i] != list2[j]) {
                    isOk = false;
                } else {
                    isOk = true;
                    break lo2;
                }
            }

            if (!isOk) {
                isEquals = false;
                break lo1;
            }
        }

        return isEquals;
    }
}
