package chapter05;

public class Exercise_05_43 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = i + 1; j <= 7; j++) {
                if (i != j) {
                    System.out.print(i + "  ");
                    System.out.println(j);
                    count++;
                } else {
                    count += 0;
                }
            }
        }
        System.out.println("The total number of all combinations is: " + count);
    }
}