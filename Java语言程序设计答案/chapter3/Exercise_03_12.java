package chapter3;

import java.util.Scanner;

public class Exercise_03_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three integers: ");
        int palindrome = input.nextInt();

        if (palindrome >= 1000 || palindrome < 100) {
            System.out.println("您输入的数有误，请重新输入一个三位整数！");
        }else {
            int baiWei = palindrome / 100;
            int geWei = palindrome % 10;

            if (baiWei == geWei) {
                System.out.println(palindrome + " is a palindrome");
            }else {
                System.out.println(palindrome + " is not a palindrome");
            }
        }
        
        input.close();
    }
}