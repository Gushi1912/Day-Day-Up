package com.gushi.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/4/7
 */
public class TimeDemo4 {
    public static void main(String[] args) throws ParseException {

        String date1 = "2020-01-01T21:30:03+08:00";
        Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss+08:00").parse(date1);
    }
}
