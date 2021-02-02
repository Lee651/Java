package chapter05;

public class Exercise_05_20 {
    public static void main(String[] args) {
        final int number_of_primes = 1000;
        final int number_of_primes_per_line = 8;
        int count = 0;
        int number = 2;

        System.out.println("The first 1000 prime number are \n");

        while (number <= number_of_primes) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
                if (count % number_of_primes_per_line == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            number++;
        }
    }
}
