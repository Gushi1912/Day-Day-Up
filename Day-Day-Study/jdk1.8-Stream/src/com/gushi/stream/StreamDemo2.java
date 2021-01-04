package com.gushi.stream;

import com.gushi.stream.model.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2020/12/31
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        test5();
    }



    public static void test1() {
        List<Dish> menu = getMenu();
        List<String> threeHighCaloricDishName = menu.stream().filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());
        System.out.println(threeHighCaloricDishName);

    }

    public static void test2() {
        List<Dish> menu = getMenu();
        List<String> getMeat = menu.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .map(d -> {
                    System.out.println(d);
                    return d.getName();
                })
                .limit(2)
                .collect(toList());
        System.out.println(getMeat);
    }

    /**
     * 映射
     */
    public static void test3() {
        List<Dish> menu = getMenu();
        List<Integer> collect = menu.stream().map(Dish::getName)
                .map(String::length)
                .collect(toList());
        System.out.println(collect);
    }

    public static void test4() {
        List<Dish> menu = getMenu();
        List<String> collect = menu.stream().map(Dish::getName)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());
        System.out.println(collect);

    }

    /**
     * 测试flatMap
     */
    public static void test5() {
        List<Integer> integers1 = Arrays.asList(1, 3, 5);
        List<Integer> integers2 = Arrays.asList(2, 4);
        List<String> collect = integers1.stream().flatMap(i -> integers2.stream()
                .filter(j -> (i + j) % 3 ==0 )
                .map(j -> new int[]{i, j}))
                .map(Arrays::toString)
                .collect(toList());
//        List<String> collect1 = collect.stream().map(Arrays::toString).collect(toList());
        System.out.println(collect);
    }

    public static void test6() {

    }
    private static List<Dish> getMenu() {
        List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));
        return menu;
    }
}
