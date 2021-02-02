package chapter04;

public class Exercise_04_25 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 26 + 65);
        int number2 = (int) (Math.random() * 26 + 65);
        int number3 = (int) (Math.random() * 26 + 65);

        int number4 = (int) (Math.random() * 10);
        int number5 = (int) (Math.random() * 10);
        int number6 = (int) (Math.random() * 10);
        int number7 = (int) (Math.random() * 10);

        System.out.println("The license plate number is " + (char) number1 + (char) number2 + (char) number3 + number4
                + number5 + number6 + number7);
    }
}