package chapter04;

import java.util.Scanner;

public class Exercise_04_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Georgia's Atlanta's latitude and longitude: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter Florida's Orlando's latitude and longitude: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter Georgia's Savannah's latitude and longitude: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        System.out.print("Enter North Carolina' Charlotte's latitude and longitude: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double radius = 6371.01;

        double distanceOfAtlantaToOrlando = radius
                * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1))
                        * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
        double distanceOfOrlandoToSavannah = radius
                * Math.acos(Math.sin(Math.toRadians(x2)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x2))
                        * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y2) - Math.toRadians(y3)));
        double distanceOfAtlantaToSavannah = radius
                * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x3)) + Math.cos(Math.toRadians(x1))
                        * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y3)));
        double distanceOfAtlantaToCharlotte = radius
                * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x1))
                        * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y4)));
        double distanceOfSanannahToCharlotte = radius
                * Math.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x4)) + Math.cos(Math.toRadians(x3))
                        * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y3) - Math.toRadians(y4)));

        double s1 = (distanceOfAtlantaToOrlando + distanceOfOrlandoToSavannah + distanceOfAtlantaToSavannah) / 2;
        double s2 = (distanceOfAtlantaToCharlotte + distanceOfAtlantaToSavannah + distanceOfSanannahToCharlotte) / 2;

        double areaOne = Math.pow(s1 * (s1 - distanceOfAtlantaToOrlando) * (s1 - distanceOfOrlandoToSavannah)
                * (s1 - distanceOfAtlantaToSavannah), 0.5);
        double areaTwo = Math.pow(s2 * (s2 - distanceOfAtlantaToCharlotte) * (s2 - distanceOfAtlantaToSavannah)
                * (s2 - distanceOfSanannahToCharlotte), 0.5);

        double area = areaOne + areaTwo;

        System.out.println("The area enclosed by these four cities is: " + area);

        input.close();
    }
}