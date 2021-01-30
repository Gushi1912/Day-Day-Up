package com.gushi.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2020/12/27
 */
/*lambda练习 */
public class LambdaDemo1 {
    public static void main(String[] args) {
//        sortByComparator();

        String[] strings = {"Hello", "world", "i", "am", "gushiyang"};

        sortByLambda(strings);
    }

    /**
     * 使用lambda表达式来替代Comparator实现类对象
     * 这种情况下我们就不需要来专门写一个实现类来重写方法
     *
     * @param strings
     */
    public static void sortByLambda(String[] strings) {
//        Arrays.sort(strings,(String o1,String o2) -> o1.length() - o2.length());
        //以上代码可以使用下面替代，comparingInt使用了lambda表达式
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strings));
    }

    private static void sortByComparator(String[] strings) {
        /* 测试自定义排序方法 */
        Arrays.sort(strings, new LengthComparator());
        System.out.println(Arrays.toString(strings));
    }
}
