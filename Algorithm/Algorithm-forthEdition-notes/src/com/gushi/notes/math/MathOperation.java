package com.gushi.notes.math;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/7/19
 * 数学方面的相关操作
 */
public class MathOperation {
    public static void main(String[] args) {
//        sqrt(34);

        System.out.println(sum(98));

    }

    /**
     * 判断一个数是否试质数
     * 为什么判断到 √N就可以了
     *  1.首先一个数的因数必然是成对出现的，且这两个因数要么是一大一小要么两个因数大小相等，比如36=3*12 36=6*6
     *  2.两个因数不等的情况下，其中一个因数必然小于 √N ，另一个因数必然大于 √N
     *  3.所以我们只需要判断在 √N 之内有没有该数的因数即可
     * @return
     */
    public static Boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
         return true;
    }

    /**
     * 计算平方根（牛顿迭代法）
     * 牛顿迭代法
     * 1.求一个数的平方根可以简化为 x^2 - a = 0
     * 2.牛顿迭代法使用的是曲线函数的切线的概念
     * 3.参考文章为：https://blog.csdn.net/u014485485/article/details/77599953
     * @param a
     * @return
     */
    public static double sqrt(double a) {
        if (a < 0) return Double.NaN;

        double err = 1e-15;
        double t = a;
        while (Math.abs(t - a/t) > err * t) {
            t = (a/t + t) / 2.0;
            System.out.println(t);
        }
        return t;
    }


    /**
     * 就计算调和级数
     * 调和级数定义
     * @return
     */
    public static double sum(int n ) {
        if (n < 0) return 0;
        double sum = 0;
        while (n > 0) {
            sum += 1.0/n;
            n--;
        }
        return sum;
    }
}
