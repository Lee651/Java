package chapter8;

import java.util.Random;

public class Exercise_08_18 {
    public static void main(String[] args) {
        int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
        shuffle(m);

        System.out.print("{");
        for (int j = 0; j < m.length; j++) {
            System.out.print("{");
            for (int i = 0; i < m[j].length; i++) {
                if (i != m[j].length - 1) {
                    System.out.print(m[j][i] + ", ");
                } else {
                    System.out.print(m[j][i] + "}");
                }
            }

            if (j != m.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static void shuffle(int[][] m) {

        int[] tem = new int[m[0].length];

        for (int i = 0; i < m.length; i++) {
            int number = new Random().nextInt(5);

            tem[0] = m[i][0];
            tem[1] = m[i][1];

            m[i][0] = m[number][0];
            m[i][1] = m[number][1];

            m[number][0] = tem[0];
            m[number][1] = tem[1];
        }
    }
}
