package chapter7;

public class Exercise_07_29 {
    public static void main(String[] args) {
        int[] playingCARDS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int number1 = playingCARDS[(int)(Math.random() * 13)];
        int number2 = playingCARDS[(int)(Math.random() * 13)];
        int number3 = playingCARDS[(int)(Math.random() * 13)];
        int number4 = playingCARDS[(int)(Math.random() * 13)];

        System.out.println(number1 + ", " + number2 + ", " + number3 + ", " + number4);
    }
}