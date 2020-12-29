package com.gushi.time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author Gushi1912
 * @date 2020/12/28
 */
public class TimeDemo2 {
    public static void main(String[] args) {
//        DateTimeFormatter formatter = new DateTimeFormatter();
//        localDateTime();
//        dateTimeFormatter();
//        timeOperation();
//
//        timeTest();  转换有些问题

        durationAndPeriod();
    }

    //LocalDateTime获取时间的方法
    public static void localDateTime() {
        LocalDateTime now1 = LocalDateTime.now();
        LocalDate now2 = LocalDate.now();
        LocalTime now3 = LocalTime.now();
        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);

//        LocalDateTime.of
    }

    /**
     * 时间转换
     */
    public static void dateTimeFormatter() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String time = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(time);
    }

    /**
     * 时间加减操作
     */
    public static void timeOperation() {
        LocalDateTime time = LocalDateTime.of(2019, 12, 23, 11, 22, 33);
        System.out.println(time);
        LocalDateTime localDateTime = time.plusDays(9).minusHours(4);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);
    }

    /**
     * 使用withXXXX操作时间和日期
     */
    public static void withTime() {
        LocalDateTime time = LocalDateTime.of(2015, 8, 23, 13, 14, 52);
        LocalDateTime localDateTime = time.withDayOfMonth(3).withMonth(12).withHour(12).withMinute(23).withSecond(44);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);

        LocalDateTime dateTime = time.with(TemporalAdjusters.firstDayOfMonth());
//        dateTime.isAfter()
    }

    public static void timeTest() {
        String s = new String("2020-12-26 11:22:33 +08:00");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, dateTimeFormatter);
        System.out.println(parse);
    }

    public static void durationAndPeriod() {
        LocalDateTime time1 = LocalDateTime.of(2020, 12, 12, 12, 12, 12);
        LocalDateTime time2 = LocalDateTime.of(2020, 12, 13, 14, 14, 34);
        Duration between = Duration.between(time1, time2);
//        Period.between()
        System.out.println(between);
    }
}
