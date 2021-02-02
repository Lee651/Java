package chapter08;

import java.util.Scanner;

public class Exercise_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isOk = true;

        System.out.print("Enter number n: ");
        int number = input.nextInt();

        char[][] lettersMatrix = new char[number][number];

        System.out.println("Enter " + number + " rows of letters separated by spaces: ");
        for (int i = 0; i < lettersMatrix.length; i++) {
            for (int j = 0; j < lettersMatrix[i].length; j++) {
                lettersMatrix[i][j] = input.next().charAt(0);
            }

            // 每输完一行就判断该行中的所有字符是否都是从A开始的前n个字符，如果不是，则直接退出，
            if (!isLetters(lettersMatrix)) {
                System.out.println("Wrong input: the letters must be from A to " + (char) (65 + lettersMatrix.length));
                isOk = false;
                break;
            }
        }

        if (isOk) {
            System.out.println("The input array is"
                    + (differentLettersOfRow(lettersMatrix) && differentLettersOfColumn(lettersMatrix) ? " " : " not ")
                    + "a Latin square");
        }

        input.close();
    }

    // 判断数组中的每一行是否是不同的字符
    public static boolean differentLettersOfRow(char[][] lettersMatrix) {
        boolean isDifferentLettersOfRow = true;

        for (int i = 0; i < lettersMatrix.length; i++) {
            for (int j = 0; j < lettersMatrix[i].length - 1; j++) {
                for (int k = j + 1; k < lettersMatrix[i].length; k++) {
                    if (lettersMatrix[i][j] == lettersMatrix[i][k]) {
                        isDifferentLettersOfRow = false;
                        break;
                    }
                }
            }
        }

        return isDifferentLettersOfRow;
    }

    // 判断数组中的每一列是否是不同的字符
    public static boolean differentLettersOfColumn(char[][] lettersMatrix) {
        boolean isDifferentLettersOfColumn = true;

        for (int i = 0; i < lettersMatrix.length; i++) {
            for (int j = 0; j < lettersMatrix[i].length - 1; j++) {
                for (int k = j + 1; k < lettersMatrix[i].length; k++) {
                    if (lettersMatrix[j][i] == lettersMatrix[k][i]) {
                        isDifferentLettersOfColumn = false;
                        break;
                    }
                }
            }
        }

        return isDifferentLettersOfColumn;
    }

    // 判断数组中的字符是否是从A开始的前n个字符
    public static boolean isLetters(char[][] lettersMatrix) {
        boolean isOk = true;
        int max = 65 + lettersMatrix.length;

        for (int i = 0; i < lettersMatrix.length; i++) {
            for (int j = 0; j < lettersMatrix[i].length; j++) {
                if ((int) lettersMatrix[i][j] > max) {
                    isOk = false;
                    break;
                }
            }
        }

        return isOk;
    }
}