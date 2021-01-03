package chapter5;

public class Exercise_05_26 {
    public static void main(String[] args) {

        double i = 10000.0;

        for (double j = 1.0; j <= 10.0; j++) {

            double k = i * j;
            double e = 1.0;
            double item = 1.0;

            for (double m = 1.0; m <= k; m++) {

                e *= m;
                item += 1.0 / e;

            }

            System.out.println("when the i = " + k + ",  the e = " + item);

        }
    }
}
