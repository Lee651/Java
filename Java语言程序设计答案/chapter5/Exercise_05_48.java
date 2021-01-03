package chapter5;

import java.util.Scanner;

public class Exercise_05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String cha = "";
        for (int i = 0; i < str.length(); i += 2) {
            cha += str.charAt(i);
        } 
        System.out.println(cha);

        input.close();
    }
}