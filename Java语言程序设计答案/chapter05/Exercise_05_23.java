package chapter05;

public class Exercise_05_23 {
    public static void main(String[] args) {
        double n = 50000.0;
        double sum1 = 0.0;
        double sum2 = 0.0;
        double i = 1.0;

        while (i <= n) {
            sum1 += 1 / i;
            i++;
        }
        System.out.println(sum1);

        while (n >= 1) {
            sum2 += 1 / n;
            n--;
        }
        System.out.println(sum2);
    }
}
