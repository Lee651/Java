package chapter1;

public class Exercise_01_04 {
    public static void main(String[] args) {
        System.out.println("a" + "\t" + "a^2" + "\t" + "a^3");
        for(int i = 1; i <= 4; i++) {
            int a = i;
            int b = i * i;
            int c = i* i * i;
            System.out.println(a + "\t" + b + "\t" + c);
        }
    }
}
