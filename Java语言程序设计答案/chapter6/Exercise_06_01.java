package chapter6;

public class Exercise_06_01 {
    public static void main(String[] args) {
        getPentagonalNumber(100);
    }

    public static int getPentagonalNumber(int n) {
        int count = 0;
        int number = 0;
        for (int i = 0; i < n; i++) {
            number = (i + 1) * (3 * (i + 1) - 1) / 2;
            count++;

            if(count % 10 == 0) {
                System.out.printf("%7d\n", number);
            } else {
                System.out.printf("%7d", number);
            }
        
         }
        return number;
    }
}