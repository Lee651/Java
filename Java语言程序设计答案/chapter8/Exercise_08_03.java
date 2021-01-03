package chapter8;

public class Exercise_08_03 {
    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] studentAndCounts = new int[8][2];

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
                studentAndCounts[i][0] = i;
                studentAndCounts[i][1] = correctCount;
            }
        }

        lo: while (true) {

            // 遍历studentAndCounts数组，如果前面的数大于后面的数，则进行交换
            for (int i = 0; i < studentAndCounts.length - 1; i++) {
                int[] tem;
                if (studentAndCounts[i][1] > studentAndCounts[i + 1][1]) {
                    tem = studentAndCounts[i];
                    studentAndCounts[i] = studentAndCounts[i + 1];
                    studentAndCounts[i + 1] = tem;
                }
            }

            // 再次遍历studentAndCount数组，确认数组中的所有数都是从小到大排列，否则循环继续交换
            boolean isSorted = true;

            for (int j = 0; j < studentAndCounts.length - 1; j++) {
                if (studentAndCounts[j][1] <= studentAndCounts[j + 1][1]) {
                    continue;
                } else {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                break lo;
            }
        }

        for (int i = 0; i < studentAndCounts.length; i++) {
            System.out.println("Student " + studentAndCounts[i][0] + "'s corrent count is " + studentAndCounts[i][1]);
        }
    }
}