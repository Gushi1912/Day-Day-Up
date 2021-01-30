package com.gushi.time;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2020/12/29
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;

/**
 * ZonedDateTime的测试，它就相当于LocalDateTime和ZoneId结合的产物
 * LocalDateTime是不带时区的，ZonedDateTime是带时区的
 */
public class TimeDemo3 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
        LocalDateTime localDateTime = now.toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.US);
        String format = formatter.format(localDateTime);
        System.out.println(format);
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
//        System.out.println(instant.getLong());
        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getNano());
    }

    /**
     * ZonedDateTime时间的创建
     */
    public static void test1() {
        ZonedDateTime time1 = ZonedDateTime.now();
        ZonedDateTime time2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
//        String format = formatter.format(time1);
//        System.out.println(format);
        System.out.println(formatter.format(time1));
        System.out.println(formatter.format(time2));
        System.out.println(time1);
        System.out.println(time2);
    }

    /**
     * LocalDateTime和ZoneId结合就可以转换成ZonedDateTime
     */
    public static void test2() {
        LocalDateTime localDateTime = LocalDateTime.of(2019,12,26,12,12,12);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
    }

    /**
     * 时区转换
     */
    public static void test3() {
        ZonedDateTime time1 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime time2 = time1.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(time1);
        System.out.println(time2);

    }
}
