package com.gushi.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2020/12/28
 */
public class TimeDemo1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //毫秒
        System.out.println(System.nanoTime()); //纳秒
//        System.out.println(System);
//        dateTime();
        calendarTime();
    }


    /**
     * Date类操作
     */
    public static void dateTime() {
        Date date = new Date();
        System.out.println(date);//Mon Dec 28 16:25:57 CST 2020
        //适用于jdk1.8之前版本的时间格式化类
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);
        Date time = new Date(1000);
        System.out.println(time);
    }

    public static void calendarTime() {
        Calendar calendar = Calendar.getInstance();
        int weeksInWeekYear = calendar.getWeeksInWeekYear();
        //将calendar类型转换为Date类型，然后就可以进行格式化了
        Date time = calendar.getTime();
        System.out.println(weeksInWeekYear);
    }
}
