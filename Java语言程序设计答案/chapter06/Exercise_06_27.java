package chapter06;

public class Exercise_06_27 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count <= 100) {
            String str1 = "";
            String str2 = "";
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
                str1 += number;

                int low = 0;
                int high = str1.length() - 1;
                boolean isPalindrome = true;

                while (low < high) {
                    if (str1.charAt(low) != str1.charAt(high)) {
                        isPalindrome = false;
                        break;
                    }
                    low++;
                    high--;
                }

                if (!isPalindrome) {
                    // 是素数但不是回文数的前提下，将number反转
                    for (int i = str1.length() - 1; i >= 0; i--) {
                        str2 += str1.charAt(i);
                    }

                    boolean notPalindromeAndPrime = true;

                    for (int i = 2; i < Integer.parseInt(str2); i++) {
                        if (Integer.parseInt(str2) % i != 0) {
                            notPalindromeAndPrime = true;
                        } else {
                            notPalindromeAndPrime = false;
                            break;
                        }
                    }

                    // 反转后的数是素数则开始计数
                    if (notPalindromeAndPrime) {
                        count++;

                        if (count % 10 == 0) {
                            System.out.println(number);
                        } else {
                            System.out.print(number + " ");
                        }
                    }
                }
            }
            number++;
        }
    }
}