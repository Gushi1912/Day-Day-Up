package com.gushi.notes.object;

import edu.princeton.cs.algs4.*;

import java.util.Scanner;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/7/21
 * 面向对象的一些操作
 */
public class ObjectOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
        graph();
    }

    public static void graph() {
        Interval1D a = new Interval1D(0.2, 0.5);
        Interval1D b = new Interval1D(0.5, 0.6);
        Interval2D box = new Interval2D(a, b);
        box.draw();

        Counter counter = new Counter("hits");
        for(int i = 0 ; i < 10000 ; i++) {
            double x = Math.random();
            double y = Math.random();
            Point2D point2D = new Point2D(x, y);
            if (box.contains(point2D)) counter.increment();
            else point2D.draw();
        }
        StdOut.println(counter);
        StdOut.println(box.area());
    }
}
