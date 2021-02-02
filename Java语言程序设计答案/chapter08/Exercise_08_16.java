package chapter08;

public class Exercise_08_16 {
    public static void main(String[] args) {
        int[][] numbers = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

        sort(numbers);
    }

    public static void sort(int m[][]) {
        int[] tem;

        lo: while (true) {
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][0] > m[i + 1][0]) {
                    tem = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = tem;
                }

                if (m[i][0] == m[i + 1][0]) {
                    if (m[i][1] > m[i + 1][1]) {
                        tem = m[i];
                        m[i] = m[i + 1];
                        m[i + 1] = tem;
                    }
                }
            }

            boolean isSort = true;

            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][0] < m[i + 1][0]) {
                    continue;
                } else if (m[i][0] == m[i + 1][0]) {
                    if (m[i][1] <= m[i + 1][1]) {
                        continue;
                    } else {
                        isSort = false;
                        break;
                    }
                } else {
                    isSort = false;
                    break;
                }
            }

            if (isSort) {
                break lo;
            }
        }

        System.out.print("{");
        for (int i = 0; i < m.length; i++) {
            System.out.print("{");
            for (int j = 0; j < m[i].length; j++) {
                if (j != m[i].length - 1) {
                    System.out.print(m[i][j] + ", ");
                } else {
                    System.out.print(m[i][j]);
                }
            }
            System.out.print("}");

            if (i != m.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("");
            }
        }
        System.out.println("}");
    }
}
