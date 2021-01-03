package chapter6;

public class Exercise_06_28 {
    public static void main(String[] args) {

        System.out.println("p         2^p-1");
        for (int i = 2; i <= 31; i++) {
            double primeNumber = Math.pow(2, i) - 1;

            boolean isPrime = true;
            for (int j = 2; j < primeNumber; j++) {
                if (primeNumber % j != 0) {
                    isPrime = true;
                } else {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.printf("%-10d%d\n", i, Math.round(primeNumber));
            }
        }
    }
}