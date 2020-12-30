package com.gushi.lambda;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2020/12/30
 */

import javax.swing.*;
import java.awt.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * lambda表达式语法
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets,(first,second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

        Timer timer1 = new Timer(1000, event -> {
            System.out.println("At the tone, the time is" + Instant.ofEpochMilli(event.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        });
        timer1.start();
    }

    public static void test1() {
        Comparator<String> comp = (first,second) -> first.length() - second.length();
        Arrays.sort(new String[]{},comp);
    }
}
