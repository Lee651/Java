package chapter09;

import java.util.Scanner;

public class Exercise_09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location location = locateLargest(array);

        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", "
                + location.column + ")");

        input.close();
    }

    public static Location locateLargest(double[][] a) {
        return new Location(a);
    }
}

class Location {
    int row;
    int column;
    double maxValue;

    Location(double[][] a) {
        row = 0;
        column = 0;
        maxValue = a[row][column];

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }
}