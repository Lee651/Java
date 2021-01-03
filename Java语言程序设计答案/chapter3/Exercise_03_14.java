package chapter3;

// import java.util.Random;
import java.util.Scanner;

public class Exercise_03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 0 or 1: ");
        int guess = input.nextInt();

        // int random = new Random().nextInt(2);
        int random = (int) (Math.random() * 2);

        if (random == guess) {
            System.out.println("guessed it");
        }else {
            System.out.println("guess wrong");
        }

        input.close();
    }
}
