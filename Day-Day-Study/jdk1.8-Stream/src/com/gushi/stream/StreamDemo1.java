package com.gushi.stream;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2020/12/25
 */

import com.gushi.stream.model.Student;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * stream的创建
 * 数组和集合都可以创建一个流
 */
public class StreamDemo1 {

    public static void main(String[] args) {
//        createStream();


    }


    private static void createStream() {
        //集合创建流
        List<String> list = Arrays.asList("a", "b", "c");
        //创建一个顺序流
        Stream<String> stream = list.stream();
        //创建一个并行流
        Stream<String> parallelStream = list.parallelStream();


        //数组创建一个流
        int[] array = {1, 3, 5};
        IntStream intStream = Arrays.stream(array);

        //文件创建流
        File file = new File("D:\\CA-infor\\面试题.txt");


        //值创建流
        //多个同类型数据创建流
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Student> studentStream = Stream.of(new Student(), new Student(), new Student());

        //单个数据创建流
        Stream<Integer> integerStream1 = Stream.of(2);


    }
}
