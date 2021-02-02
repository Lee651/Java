package chapter06;

public class Exercise_06_08 {
    public static void main(String[] args) {

        System.out.println("摄氏度     华氏度          华氏度     摄氏度");

        for (double i = 40.0, j = 120.0; i >= 31.0 && j >= 30.0; i--, j -= 10) {
            System.out.printf("%-7.1f%10.1f", i, celsiusToFahrenheit(i));
            System.out.print("          ");
            System.out.printf("%-12.1f%5.2f\n", j, fahrenheitToCelsius(j));
        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheitTemperature = (9.0 / 5) * celsius + 32;
        return fahrenheitTemperature;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsiusTemperature = (5.0 / 9) * (fahrenheit - 32);
        return celsiusTemperature;
    }
}