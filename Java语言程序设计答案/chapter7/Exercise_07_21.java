package chapter7;

import java.util.Random;
import java.util.Scanner;

public class Exercise_07_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = input.nextInt();

        int[] slotsList = new int[slots];

        for (int i = 0; i < balls; i++) {
            int Right = 0;

            for (int j = 0; j < slots - 1; j++) {

                // 随机产生0和1
                int rm = new Random().nextInt(2);
                if (rm == 0) {
                    // 产生的随机数为0表示向左
                    System.out.print("L");
                } else {
                    // 产生的随机数为1表示向右
                    System.out.print("R");
                    // 向右走到次数等于其最终落在哪个槽
                    Right++;
                }
            }
            // 每个球走完后换行输出
            System.out.println();
            
            // 小球最终落在哪个槽，哪个槽中的数+1
            slotsList[Right] ++;
        }

        // 获取数组中的最大数，以便确定后面打印的次数
        int max = slotsList[0];
        for (int k = 0; k < slotsList.length; k++) {
            if (slotsList[k] > max) {
                max = slotsList[k];
            }
        }

        while (max > 0) {
            System.out.println();

            for (int m = 0; m < slotsList.length; m++) {
                if (slotsList[m] >= max) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            max--;
        }

        input.close();
    }
}