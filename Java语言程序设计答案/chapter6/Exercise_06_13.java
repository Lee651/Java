package chapter6;

public class Exercise_06_13 {
    public static void main(String[] args) {
        int number = 20;
        calculateNumberLevel(number);
    }

    public static void calculateNumberLevel(int number) {
        double m = 0.0;

        System.out.println("i          m(i)");

        for (int i = 1; i <= number; i++) {
            m += i / (i + 1.0);
            System.out.printf("%-10d%.4f\n", i, m);
        }
    }
}