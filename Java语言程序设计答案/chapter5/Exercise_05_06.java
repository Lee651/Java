package chapter5;

public class Exercise_05_06 {
    public static void main(String[] args) {
        System.out.println("英里           千米          千米           英里");
        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {
            System.out.printf("%-12d%7.3f", i, i * 1.609);
            System.out.print("          ");
            System.out.printf("%-9d%10.3f\n", j, j / 1.609);
        }
    }
}
