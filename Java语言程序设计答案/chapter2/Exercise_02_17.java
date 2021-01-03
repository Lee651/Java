package chapter2;

import java.util.Scanner;

public class Exercise_02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double fahrenheitTemperature = input.nextDouble();

        System.out.print("Enter the wind speed(>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double t_wc = 35.74 + 0.6215 * fahrenheitTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * Math.pow(windSpeed, 0.16) * fahrenheitTemperature;

        System.out.println("The wind chill index is " + t_wc);

        input.close();
    }
}