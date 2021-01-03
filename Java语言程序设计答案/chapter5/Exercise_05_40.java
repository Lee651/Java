package chapter5;

import java.util.Random;

public class Exercise_05_40 {
    public static void main(String[] args) {
        int count = 1;
        int targetNumber = 1000000;
        int countOf0 = 0;
        int countOf1 = 0;

        while (count <= targetNumber) {
            Random random = new Random();
            int number = random.nextInt(2);

            if (number == 0) {
                countOf0++;
            } else {
                countOf1++;
            }

            count++;
        }
        System.out.println("The number of heads is zero: " + countOf0);
        System.out.println("The degree of tails is zero: " + countOf1);
    }
}
