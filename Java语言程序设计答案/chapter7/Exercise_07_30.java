package chapter7;

import java.util.Scanner;

public class Exercise_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()];

        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        System.out.println("The list has" + (isConsecutiveFour(values) ? " " : " no ") + "consecutive fours");

        input.close();
    }

    public static boolean isConsecutiveFour(int[] values) {
        boolean isOk = true;
        
        for (int i = 0; i < (values.length - 3); i++) {
            boolean isConsecutiveFours = true;
            int count = i + 1;
            lo: while (count < (i + 4)) {
                if (values[i] != values[count]) {
                    isConsecutiveFours = false;
                    break lo;
                }
                count++;
            }

            if (isConsecutiveFours) {
                isOk = true;
                break;
            } else {
                isOk = false;
            }
        }

        return isOk;
    }
}