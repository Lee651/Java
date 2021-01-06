package chapter8;

import java.util.Scanner;

public class Exercise_08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        // 将十进制数转二进制字符串
        String result = Integer.toBinaryString(number);
        // 将String转化成StringBuffer类型
        StringBuffer results = new StringBuffer(result);

        //
        while (results.length() < 9) {
            results.insert(0, 0);
        }

        // System.out.println(results);

        char[] s = results.toString().toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '1') {
                System.out.print("T ");
            } else {
                System.out.print("H ");
            }

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}