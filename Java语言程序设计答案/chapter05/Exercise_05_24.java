package chapter05;

public class Exercise_05_24 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (double i = 1.0; i <= 49.0; i++) {
            sum += (2 * i - 1) / (2 * i + 1);
        }
        System.out.println(sum);
    }
}
