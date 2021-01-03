package chapter5;

public class Exercise_05_18 {
    public static void main(String[] args) {

        // 第一副图
        for (int i = 1; i <= 6; i++) {
            int k = 1;
            while (k <= i) {
                if (k < i) {
                    System.out.print(k + " ");
                } else {
                    System.out.println(k);
                }

                k++;
            }
        }

        System.out.println("------------");

        // 第二副图
        for (int i = 6; i >= 1; i--) {
            int k = 1;
            while (k <= i) {
                if (k < i) {
                    System.out.print(k + " ");
                } else {
                    System.out.println(k);
                }

                k++;
            }
        }

        System.out.println("-------------");

        //第三副图
        for (int i = 1; i <= 6; i++) {
            int j = (6 - i ) * 2;
            int l = 0;

            while (l < j) {
                System.out.print(" ");
                l++;
            }

            int k = i;
            while (1 <= k) {
                if (k == 1) {
                    System.out.println(k);
                } else {
                    System.out.print(k + " ");
                }
                k--;
            }
        }

        System.out.println("-------------");

        // 第四副图
        for (int i = 6; i >= 1; i--) {

            int j = (6 - i) * 2;
            int l = 0;
            while (l < j) {
                System.out.print(" ");
                l++;
            }

            int k = 1;
            while (k <= i) {
                if (k == i) {
                    System.out.println(k);
                } else {
                    System.out.print(k + " ");
                }
                k++;
            }
        }
    }
}
