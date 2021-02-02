package chapter05;

public class Exercise_05_15 {
    public static void main(String[] args) {

        int n = 33;
        int count = 0;

        while (n >= 33 && n <= 126) {
            count++;
            if (count % 10 == 0) {
                System.out.println((char) n);
            } else {
                if (n == 126) {
                    System.out.println((char) n);
                }
                System.out.print((char) n + " ");
            }
            n++;
        }
    }
}