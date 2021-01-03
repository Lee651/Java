package chapter7;

import java.util.Random;

public class Exercise_07_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55));
    }

    public static int getRandom(int... numbers) {
        int mum;
        boolean isHaving;

        do {
            isHaving = false;
            mum = new Random().nextInt(54) + 1;

            for (int e : numbers) {
                if (e == mum) {
                    isHaving = true;
                }
            }
        } while (isHaving);

        return mum;
    }
}