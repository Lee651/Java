package chapter3;

public class Exercise_03_24 {
    public static void main(String[] args) {
        int randomSize = (int)(Math.random() * 13 + 1.0);
        int randomColor = (int) (Math.random() * 4);

        System.out.print("The card you pick is ");

        if (randomSize == 1) {
            System.out.print("Ace");
        }else if (randomSize == 11) {
            System.out.print("Jack");
        }else if (randomSize == 12) {
            System.out.print("Queen");
        }else if (randomSize == 13) {
            System.out.print("King");
        }else {
            System.out.print(randomSize);
        }

        System.out.print(" of ");

        switch (randomColor) {
            case 0:
                System.out.print("Clubs");
                break;
            case 1:
                System.out.print("Diamonds");
                break;
            case 2:
                System.out.print("Hearts");
                break;
            default:
                System.out.print("Spades");
                break;
        }
    }
}