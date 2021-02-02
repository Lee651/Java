package chapter06;

public class Exercise_06_26 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count <= 100) {
            String str = "";
            boolean isPrimeNumber = true;

            // 判断是否是素数
            for (int i = 2; i < number; i++) {
                if (number % i != 0) {
                    isPrimeNumber = true;
                } else {
                    isPrimeNumber = false;
                    break;
                }
            }

            // 是素数的前提下再判断是否是回文数
            if (isPrimeNumber) {
                // 将数字转换成字符串
                str += number;

                int low = 0;
                int high = str.length() - 1;
                boolean isPalindrome = true;

                while (low < high) {
                    if (str.charAt(low) != str.charAt(high)) {
                        isPalindrome = false;
                        break;
                    }
                    low++;
                    high--;
                }

                if (isPalindrome) {
                    // 即是素数又是回文数则开始计数
                    count++;

                    if (count % 10 == 0) {
                        System.out.println(number);
                    } else {
                        System.out.print(number + " ");
                    }
                }
            }
            number++;
        }
    }
}