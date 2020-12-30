package com.gushi.lambda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2020/12/30
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        test1();
    }

    //测试方法调用
    public static void test1() {
        Timer timer = new Timer(1000, System.out::println);
        timer.start();

    }

    public static void test2() {
        ArrayList<Object> list = new ArrayList<>();
        list.removeIf(Objects::isNull);
    }
}
