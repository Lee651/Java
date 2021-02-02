package chapter07;

import java.util.Scanner;

public class Exercise_07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("The index of the fulcrum element is: " + partition(list));

        input.close();
    }

    public static int partition(int[] list) {
        int count = 0;

        lo: while (true) {
            boolean isOk = true;

            // 后面的数如果比前面的数大，就进行交换，保证所有小于这个数的数都在这个数的前面，但是大于这个数的数可能在它前面
            // 由于这个数不停的在进行交换，其下标也随之改变，所以用count变量记录每次下标的值
            for (int i = 1; i < list.length; i++) {
                int tem;
                if (list[i] < list[count]) {
                    tem = list[count];
                    list[count] = list[i];
                    list[i] = tem;

                    count = i;
                }
            }

            // 遍历这个数之前的所有数，如果这个数前面有比它大的数，则进行交换，这样的还有可能导致这个数的后面有小于这个数的数
            for (int j = 0; j < count; j++) {
                int tem;
                if (list[j] > list[count]) {
                    tem = list[j];
                    list[j] = list[count];
                    list[count] = tem;

                    count = j;
                }
            }

            // 遍历这个数之后的所有数，如果后面所有的数都大于等于这个数，则退出循环，否则继续循环处理
            for (int k = (count + 1); k < list.length; k++) {
                if (list[k] >= list[count]) {
                    isOk = true;
                } else {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                break lo;
            }
        }

        System.out.print("After the partition, the list is");
        for (int e : list) {
            System.out.print(" " + e);
        }

        System.out.println();

        return count;
    }
}