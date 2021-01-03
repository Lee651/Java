package chapter5;

import java.util.Scanner;

public class Exercise_05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerCount = 0;
        int yourCount = 0;

        lo: while (true) {

                System.out.print("scissor(0), rock(1), paper(2): ");
                int guess = input.nextInt();

                int random = (int)(Math.random() * 3);

                System.out.print("The computer is ");
                switch (random) {
                    case 0:
                        System.out.print("scissor. ");
                        break;
                    case 1:
                        System.out.print("rock. ");
                        break;
                    default:
                        System.out.print("paper. ");
                        break;
                }

                System.out.print("you are ");
                switch (guess) {
                    case 0:
                        System.out.print("scissor");
                        break;
                    case 1:
                        System.out.print("rock");
                        break;
                    default:
                        System.out.print("paper");
                        break;
                }

                if (random == guess) {
                    System.out.println(" too. It is a draw");
                }else {
                    boolean win = (random == 0 && guess == 1) || (random == 1 && guess == 2) || (random == 2 && guess == 0);

                    if (win) {
                        System.out.println(". You won");
                        yourCount++;
                        if (yourCount >= 3) {
                            break lo;
                        }
                    }else {
                        System.out.println(". You lost");
                        computerCount++;
                        if (computerCount >= 3) {
                            break lo;
                        }
                    }
                }
            }

        input.close();
    }
}