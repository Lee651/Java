package chapter7;

import java.util.Scanner;

public class Exercise_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] chineseZodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};


        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println(chineseZodiacs[year % 12]);
        input.close();
    }
}