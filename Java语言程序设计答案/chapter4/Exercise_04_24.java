package chapter4;

import java.util.Scanner;

public class Exercise_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        String temp;

        if (secondCity.compareTo(firstCity) < 0 && secondCity.compareTo(thirdCity) < 0) {
            temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        } else if (thirdCity.compareTo(firstCity) < 0 && thirdCity.compareTo(secondCity) < 0) {
            temp = firstCity;
            firstCity = thirdCity;
            thirdCity = temp;
        }

        if (thirdCity.compareTo(secondCity) < 0) {
            temp = secondCity;
            secondCity = thirdCity;
            thirdCity = temp;
        }

        System.out.println("The three city in alphabetical order are: " + firstCity + " " + secondCity + " " + thirdCity);

        input.close();
    }
}