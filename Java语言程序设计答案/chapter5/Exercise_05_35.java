package chapter5;

public class Exercise_05_35 {
    public static void main(String[] args) {
        double sum = 0.0;

        for (double i = 1.0; i <= 624.0; i++) {
            sum += 1.0 / (Math.pow(i, 0.5) + Math.pow(i + 1.0, 0.5));
        }

        System.out.println(sum);
    }
}
