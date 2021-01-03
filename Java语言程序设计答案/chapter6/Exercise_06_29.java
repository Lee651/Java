package chapter6;

public class Exercise_06_29 {
    public static void main(String[] args) {
        int number = 2;
        
        while (number < 1000) {
            boolean isPrime1 = true;
            boolean isPrime2 = true;


            for (int i = 2; i < number; i++) {
                if (number % i != 0) {
                    isPrime1 = true;
                } else {
                    isPrime1 = false;
                    break;
                }
            }

            for (int j = 2; j < (number + 2); j++) {
                if ((number + 2) % j != 0) {
                    isPrime2 = true;
                } else {
                    isPrime2 = false;
                    break;
                }
            }

            if (isPrime1 && isPrime2) {
                System.out.println("(" + number + ", " + (number + 2) + ")");
            }

            number++;
        }
    }
}