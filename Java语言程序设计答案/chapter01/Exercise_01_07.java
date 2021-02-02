package chapter01;

public class Exercise_01_07 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 7; i++) {
            int base = -1;
            int index = i + 1;

            double y = Math.pow(base, index);
            sum += y * (1.0 / (2 * i - 1));
        }
        double z = 4 * sum;
        System.out.println(z);
    }
}