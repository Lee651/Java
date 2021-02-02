package chapter10;

public class Exercise_10_02 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(13);

        System.out.println(myInteger.getValue());
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());

        System.out.println(">>>>>>>>>>>>>>>>>>>");

        char[] value = { '2', '3', '4' };
        System.out.println(MyInteger.parseInt(value));

        String str = "hello";
        System.out.println(MyInteger.parseInt(str));
    }
}

class MyInteger {
    int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }

    public static int parseInt(char[] cha) {
        int number = 0;

        for (int i = 0, j = (int) Math.pow(10, cha.length - 1); i < cha.length; i++, j /= 10) {
            number += ((int) cha[i] - 48) * j;
        }

        return number;
    }

    public static int parseInt(String str) {
        // char[] cha = str.toCharArray();

        // int number = 0;

        // for (int i = 0, j = (int) Math.pow(10, cha.length - 1); i < cha.length; i++,
        // j /= 10) {
        // number += ((int) cha[i] - 48) * j;
        // }

        // return number;

        int number = 0;

        for (int i = 0, j = (int) Math.pow(10, str.length() - 1); i < str.length(); i++, j /= 10) {
            number += ((int) str.charAt(i) - 48) * j;
        }

        return number;

    }
}