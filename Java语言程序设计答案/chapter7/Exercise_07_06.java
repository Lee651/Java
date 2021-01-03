package chapter7;

public class Exercise_07_06 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int startNumber = 2;
        int count = 0; 
        boolean isPrime = true;

        while (count < arr.length) {
            for (int i = 2; i <= (int)Math.sqrt(startNumber); i++) {
                if (startNumber % i != 0) {
                    isPrime = true;
                } else {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                arr[count] = startNumber;
                count++;
            }

            startNumber++;
        }

        for (int j = 0; j < arr.length; j++) {
            if ((j + 1) % 10 == 0) {
                System.out.println(arr[j]);
            } else {
                System.out.print(arr[j] + " ");
            }
        }
    }
}