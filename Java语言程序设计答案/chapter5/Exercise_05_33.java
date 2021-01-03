package chapter5;

public class Exercise_05_33 {
    public static void main(String[] args) {
        int count = 2;
        
        while (count <= 10000) {
            int sum = 0;

            for (int i = 1; i < count; i++) {
                if (count % i == 0) {
                    sum += i;
                } else {
                    sum += 0;
                }
            }

            if (sum == count) {
                System.out.println(count);
            }

            count++;
        }
    }
}