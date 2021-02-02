package chapter07;

import java.util.Scanner;

public class Exercise_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = input.next();

        System.out.println("The sorted string is: " + sort(s));

        input.close();
    }

    public static String sort(String s) {
        // 先将字符串转成字符数组
        char[] chars = s.toCharArray();

        lo: while (true) {
            boolean isSorted = true;

            // 遍历数组，如果后面的字符小于前面的字符就进行交换
            for (int i = 0; i < chars.length - 1; i++) {
                char tem;
                if (chars[i] > chars[i + 1]) {
                    tem = chars[i];
                    chars[i] = chars[i + 1];
                    chars[i + 1] = tem;
                }
            }

            // 第一次交换完后再次遍历数组，确保数组中前面的字符一定小于后面的字符，否则循环继续交换
            for (int j = 0; j < chars.length - 1; j++) {
                if (chars[j] <= chars[j + 1]) {
                    isSorted = true;
                } else {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                break lo;
            }
        }

        // 将字符数组转成字符串
        String sorted = String.valueOf(chars);

        return sorted;
    }
}