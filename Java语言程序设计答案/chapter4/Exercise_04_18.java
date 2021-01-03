package chapter4;

import java.util.Scanner;

public class Exercise_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String str = input.nextLine();

        char char1 = str.charAt(0);
        char char2 = str.charAt(1);

        if (Character.isLetter(char1)) {
            if (char2 != '1' || char2 != '2' || char2 != '3' || char2 != '4') {
                System.out.println("Invalid input");
            } else {
                switch (char1) {
                    case 'M':
                        System.out.print("Mathematics ");
                        break;
                    case 'C':
                        System.out.print("Computer Science ");
                        break;
                    case 'I':
                        System.out.print("Information Technology ");
                        break;
                    default:
                        System.out.println("Invalid input");
                        System.exit(1);
                }
        
                switch (char2) {
                    case '1':
                        System.out.println("Freshman");
                        break;
                    case '2':
                        System.out.println("Sophomore");
                        break;
                    case '3':
                        System.out.println("Junior");
                        break;
                    default:
                        System.out.println("Senior");
                        break;
                }
            }

        } else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
