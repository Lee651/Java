package chapter5;

public class Exercise_05_03 {
    public static void main(String[] args) {
        
        System.out.println("千克               磅");

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%-15d%6.1f\n", (i * 2 - 1), 2.2 * (i * 2 - 1));
        }
    }
}