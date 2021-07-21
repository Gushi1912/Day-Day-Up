package com.gushi.map;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/1/25
 */

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 */
public class LeetCode001 {
    public static void main(String[] args) {
//        int[] nums = {2, 34, 5, 76, 7, 8, 9, 3, 2, 6, 2};
//        int[] nums = {3,3};
        int[] nums = {2,7,11,5};
        int target = 9;
//        int[] result = solution1(nums, target);
        int[] result = solution2(nums, target);
        System.out.println(Arrays.toString(result));

    }

    /**
     * 暴力破解
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了33.25%的用户
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution1(int[] nums,int target) {
        int length = nums.length;
        int another = 0;
        for (int i = 0; i < length; i++) {
            another = target - nums[i];
            for (int j = i + 1; j < length; j++) {
                if (another == nums[j])
                    return new int[]{i,j};
            }
        }
        return null;
    }

    /**
     *利用hashMap,map中存储的是数组中每一个数相对于target的补数
     * 每次只需要比较当前所遍历到的数是否再hashMap中存在就可得到结果。
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution2(int[] nums,int target){
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target - nums[i],i);
        }
        return null;
    }
}
