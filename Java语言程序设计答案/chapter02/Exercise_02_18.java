package chapter02;

public class Exercise_02_18 {
    public static void main(String[] args) {
        System.out.println("a" + "\t" + "b" + "\t" + "pow(a, b)");

        for (int i = 1; i <= 5; i++) {
            int a = i;
            int b = i + 1;
            int power = (int) Math.pow(a, b);

            System.out.println(a + "\t" + b + "\t" + power);
        }
    }
}