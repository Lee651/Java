package chapter6;

import java.util.Scanner;

public class Exercise_06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a char: ");
        char a = input.nextLine().charAt(0);

        System.out.println("The number of times " + a + " appears in the string " + str + " is " + count(str, a));

        input.close();
    }

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }

        return count;
    }
}