package chapter06;

public class Exercise_06_38 {
    public static void main(String[] args) {
        final int numberOfUpperChar = 100;
        final int numberOflowerChar = 100;
        final int char_per_line = 10;

        for (int i = 0; i < numberOfUpperChar; i++) {
            char ch1 = RandomCharacter.getRandomUpperCaseLetter();
            if ((i + 1) % char_per_line == 0) {
                System.out.println(ch1);
            } else {
                System.out.print(ch1 + " ");
            }
        }

        System.out.println("-------------------");

        for (int j = 0; j < numberOflowerChar; j++) {
            char ch2 = RandomCharacter.getRandomLowerCaseLetter();
            if ((j + 1) % char_per_line == 0) {
                System.out.println(ch2);
            } else {
                System.out.print(ch2 + " ");
            }
        }
    }
}