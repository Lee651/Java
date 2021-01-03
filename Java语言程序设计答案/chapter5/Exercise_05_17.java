package chapter5;

import java.util.Scanner;

public class Exercise_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        int i = 1;
        int k = 1;
        int j = 0;
        int m = 0;
        
        if (number >= 10) {
            m = 16 + (number - 9) * 3;
        } else {
            m = (number - 1) * 2;
        }

        while (m >= 1) {
            System.out.print(" ");
            m--;
        }

        System.out.println(1);
       
        while (k < number) {
            k++;
            i = k;

            // 每一行开始空的格数
            if (number >= 10) {
                if (i < 10) {
                    j = (number - i) * 2 + (number - 9);
                } else {
                    j = (number - i) * 3;
                }
            } else {
                j = (number - i) * 2;
                
            }
            
            while (j >= 1) {
                System.out.print(" ");
                j--;
            }

            while (i != 0) {
                if (i == 1) {
                    System.out.print(i + " ");

                    int l = 2;
                    while (l < k) {
                        System.out.print(l + " ");
                        l++;
                    }
                    System.out.println(k);
                } else {
                    System.out.print(i + " ");
                }

                i--;
            }
        }

        input.close();
    }
}