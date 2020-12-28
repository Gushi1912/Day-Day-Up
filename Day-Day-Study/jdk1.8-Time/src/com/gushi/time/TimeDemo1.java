package com.gushi.time;

import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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
//        calendarTime();
        calendarTimeZone();
    }


    /**
     * Date类操作
     */
    public static void dateTime() {
        Date date = new Date();
        System.out.println(date);//Mon Dec 28 16:25:57 CST 2020
        //适用于jdk1.8之前版本的时间格式化类
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        dateFormat.format(new Date(),"yyyy-MM-dd",new FieldPosition())
        String format = dateFormat.format(date);
        System.out.println(format);
        Date time = new Date(1000);
        System.out.println(time);
    }


    /**
     * Calendar类操作
     */
    public static void calendarTime() {
        Calendar calendar = Calendar.getInstance();
        int weeksInWeekYear = calendar.getWeeksInWeekYear();
        //将calendar类型转换为Date类型，然后就可以进行格式化了
        Date time = calendar.getTime();
        System.out.println(weeksInWeekYear);

    }

    /**
     * calendar的时区转换操作
     */
    public static void calendarTimeZone() {
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
        //清空所有字段值
        calendar.clear();
//        System.out.println(calendar);
        //清空前后的输出值对比
//        java.util.GregorianCalendar[time=1609165893099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=29,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=363,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=31,SECOND=33,MILLISECOND=99,ZONE_OFFSET=28800000,DST_OFFSET=0]
//        java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=29,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]

        calendar.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
//        calendar.setTime(new Date());
//        calendar.set(2019,12,28,22,40,23);
        //0-11 表示1-12月
        calendar.set(2019, Calendar.DECEMBER, 20, 8, 15, 0);
        System.out.println(calendar.getTime());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("American/New_York"));
        String format = dateFormat.format(calendar.getTime());
        System.out.println(format);
        Date now = new Date();
        //获取的是一个long类型的时间戳
        System.out.println(now.getTime());
    }
}
