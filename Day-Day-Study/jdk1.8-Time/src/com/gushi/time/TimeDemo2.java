package com.gushi.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Gushi1912
 * @date 2020/12/28
 */
public class TimeDemo2 {
    public static void main(String[] args) {
//        DateTimeFormatter formatter = new DateTimeFormatter();
        localDateTime();

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
}
