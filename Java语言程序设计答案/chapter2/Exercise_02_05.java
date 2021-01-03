package chapter2;

import java.util.Scanner;

public class Exercise_02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate: ");
        int subtotal = input.nextInt();
        int gratuity = input.nextInt();

        double gratuitys = subtotal * gratuity * 0.01;
        double total = subtotal + gratuitys;

        System.out.println("The gratuity is " + "$" + gratuitys + " and total is " + "$" + total);

        input.close();
    }
}