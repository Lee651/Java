package chapter7;

import java.util.Scanner;

public class Exercise_07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten integer: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int count = 1;

        while (count <= (int) (Math.pow(numbers.length, 2))) {
            String arr = "[" + numbers[(int)(Math.random() * 10)] + ", " + numbers[(int)(Math.random() * 10)] + "]";
      
            if (count % 10 == 0) {
                System.out.println(arr);
            } else {
                System.out.print(arr + " ");
            }

            count++;
        }

        input.close();
    }
}