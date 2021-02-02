package chapter07;

import java.util.Scanner;

public class Exercise_07_27 {
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

        System.out.println("Two lists are" + ((equals(list1, list2)) ? " " : " not ") + "identical");

        input.close();
    }

    public static boolean equals(int[] list1, int[] list2) {
        boolean isEquals = true;
        boolean isEquals1 = true;
        boolean isEquals2 = true;
        int count1 = 0, count2 = 0;

        // 数组List1中的每一个元素在数组list2中都要有,isEquals1才会返回true
        lo: while (count1 < list1.length) {
            boolean isExit1 = true;

            for (int i = 0; i < list2.length; i++) {
                if (list1[count1] == list2[i]) {
                    isExit1 = true;
                    break;
                } else {
                    isExit1 = false;
                    continue;
                }
            }

            if (isExit1) {
                count1++;
            } else {
                isEquals1 = false;
                break lo;
            }

        }

        // 数组list2中的每一个元素在数组list1中都要有，isEquals2才会返回true
        lo: while (count2 < list2.length) {
            boolean isExit2 = true;

            for (int j = 0; j < list1.length; j++) {
                if (list2[count2] == list1[j]) {
                    isExit2 = true;
                    break;
                } else {
                    isExit2 = false;
                    continue;
                }
            }

            if (isExit2) {
                count2++;
            } else {
                isEquals2 = false;
                break lo;
            }

        }

        // 只有isEquals1和isEquals2都为true，才能说明两个数组内容相同
        if (isEquals1 && isEquals2) {
            isEquals = true;
        } else {
            isEquals = false;
        }

        return isEquals;
    }
}