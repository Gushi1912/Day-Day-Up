package com.gushi.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/5/11
 */
public class TraceIDDemo {
    public static void main(String[] args) {

        String format = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        for (int i = 0; i < 5;i++) {
            format += new Random().nextInt(10);
        }
        System.out.println(format);
    }
}
