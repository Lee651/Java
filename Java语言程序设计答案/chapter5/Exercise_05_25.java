package chapter5;

public class Exercise_05_25 {
    public static void main(String[] args) {
        double i = 10000;

        for (double j = 1.0; j <= 10.0; j++) {

            double k = i * j;
            double sum = 0.0;

            for (double m = 1.0; m <= k; m++) {

                sum += Math.pow(-1, m + 1.0) / (2 * m - 1.0);

            } 
            
            System.out.println("when the i = " + k + ", the pai is " + sum * 4);
        }
    }
}
