package chapter7;

import java.util.Scanner;

public class Exercise_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten double digits: ");
        double[] list = new double[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        selectionSort(list);

        input.close();
    }

    public static void selectionSort(double[] list) {
        
        for (int i = list.length - 1; i >= 0; i--) {
            double tem;
            for (int j = 0; j < i; j++) {
                if (list[j] > list[i]) {
                    tem = list[j];
                    list[j] = list[i];
                    list[i] = tem;
                }
            }
        }

        System.out.print("The list is");
        for (double e : list) {
            System.out.print(" " + e);
        }

        System.out.println();
    }
}