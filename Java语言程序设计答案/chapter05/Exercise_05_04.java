package chapter05;

public class Exercise_05_04 {
    public static void main(String[] args) {
        System.out.println("英里          千米");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-12d%6.3f\n", i, i * 1.609);
        }
    }
}