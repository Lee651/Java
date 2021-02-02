package chapter05;

public class Exercise_05_27 {
    public static void main(String[] args) {
        int startYear = 101;
        int endYear = 2100;
        int count = 0;

        System.out.println("Run years from " + startYear + " to " + endYear + " are: ");

        while (startYear <= endYear) {
            if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0)) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(startYear);
                } else {
                    System.out.print(startYear + " ");
                }
                startYear++;
            } else {
                startYear++;
            }
        }
        System.out.println("");
    }
}
