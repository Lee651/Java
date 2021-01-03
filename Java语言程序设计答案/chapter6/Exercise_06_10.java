package chapter6;

public class Exercise_06_10 {
    public static void main(String[] args) {
        System.out.print("The number of primes less than 10000 is ");
        printPrimeNumber(10000);
    }

    public static void printPrimeNumber(int number) {
        int count = 0;
        int startNumber = 2;

        while (startNumber < number) {
            if (isPrime(startNumber)) {
                count++;
            }

            startNumber++;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int startNumber) {
        for (int divisor = 2; divisor <= startNumber / 2; divisor++) {
            if (startNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}