package chapter06;

public class Exercise_06_09 {
    public static void main(String[] args) {
        System.out.println("英尺          米          米          英尺");

        for (double i = 1.0, j = 20.0; i <= 10.0 && j <= 65.0; i++, j += 5) {
            System.out.printf("%-11.1f%5.3f", i, footToMeter(i));
            System.out.print("          ");
            System.out.printf("%-10.1f%7.3f\n", j, meterToFoot(j));
        }
    }

    public static double footToMeter(double foot) {
        double meterNumber = 0.305 * foot;
        return meterNumber;
    }

    public static double meterToFoot(double meter) {
        double footNumber = 3.279 * meter;
        return footNumber;
    }
}
