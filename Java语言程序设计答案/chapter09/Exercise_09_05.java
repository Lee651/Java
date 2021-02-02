package chapter09;

import java.util.GregorianCalendar;

public class Exercise_09_05 {
    public static void main(String[] args) {
        // 创建当前日期的实例
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("年份为: " + gregorianCalendar.get(GregorianCalendar.YEAR) + ", 月份为："
                + (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + ", 日期为: "
                + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println("年份为: " + gregorianCalendar.get(GregorianCalendar.YEAR) + ", 月份为："
                + (gregorianCalendar.get(GregorianCalendar.MONTH) + 1) + ", 日期为: "
                + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
