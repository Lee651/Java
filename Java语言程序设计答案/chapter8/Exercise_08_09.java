package chapter8;

import java.util.Scanner;

public class Exercise_08_09 {
    public static void main(String[] args) {
        String[][] ticktacktoe = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };

        print(ticktacktoe);

        Scanner input = new Scanner(System.in);

        int count = 0;

        lo: while (true) {

            if (count >= 4) {
                System.out.println("平局");
                break lo;
            }

            System.out.print("Enter a row(0, 1, 2) for player X: ");
            int p1 = input.nextInt();
            System.out.print("Enter a column(0, 1, 2) for player X: ");
            int p2 = input.nextInt();

            ticktacktoe[p1][p2] = "X";
            count++;
            print(ticktacktoe);

            if (win(ticktacktoe)) {
                System.out.println("X player won");
                break lo;
            }

            System.out.print("Enter a row(0, 1, 2) for player O: ");
            int x1 = input.nextInt();
            System.out.print("Enter a column(0, 1, 2) for player O: ");
            int x2 = input.nextInt();

            ticktacktoe[x1][x2] = "O";
            print(ticktacktoe);

            if (win(ticktacktoe)) {
                System.out.println("O player won");
                break lo;
            }
        }

        input.close();
    }

    public static void print(String[][] ticktacktoe) {
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + ticktacktoe[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }

    public static boolean win(String[][] ticktacktoe) {
        boolean isOk = false;

        // 横向相等
        if (ticktacktoe[0][0] != " " && ticktacktoe[0][0] == ticktacktoe[0][1]
                && ticktacktoe[0][0] == ticktacktoe[0][2]) {
            isOk = true;
        }

        if (ticktacktoe[1][0] != " " && ticktacktoe[1][0] == ticktacktoe[1][1]
                && ticktacktoe[1][0] == ticktacktoe[1][2]) {
            isOk = true;
        }

        if (ticktacktoe[2][0] != " " && ticktacktoe[2][0] == ticktacktoe[2][1]
                && ticktacktoe[2][0] == ticktacktoe[2][1]) {
            isOk = true;
        }

        // 纵向相等
        if (ticktacktoe[0][0] != " " && ticktacktoe[0][0] == ticktacktoe[1][0]
                && ticktacktoe[0][0] == ticktacktoe[2][0]) {
            isOk = true;
        }

        if (ticktacktoe[0][1] != " " && ticktacktoe[0][1] == ticktacktoe[1][1]
                && ticktacktoe[0][1] == ticktacktoe[2][1]) {
            isOk = true;
        }

        if (ticktacktoe[0][2] != " " && ticktacktoe[0][2] == ticktacktoe[1][2]
                && ticktacktoe[0][2] == ticktacktoe[2][2]) {
            isOk = true;
        }

        // 斜对角相等
        if (ticktacktoe[0][0] != " " && ticktacktoe[0][0] == ticktacktoe[1][1]
                && ticktacktoe[0][0] == ticktacktoe[2][2]) {
            isOk = true;
        }

        if (ticktacktoe[0][2] != " " && ticktacktoe[0][2] == ticktacktoe[1][1]
                && ticktacktoe[0][2] == ticktacktoe[2][0]) {
            isOk = true;
        }

        return isOk;
    }
}