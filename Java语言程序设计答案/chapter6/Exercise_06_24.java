package chapter6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_06_24 {
    public static void main(String[] args) {
        //System.out.println(new Date().toLocaleString());

        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(format.format(date));
    }
}