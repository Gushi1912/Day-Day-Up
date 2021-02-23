package com.gushi;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/1/27
 */

import java.util.HashMap;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 示例 4:
 * 输入: s = ""
 * 输出: 0
 *
 * 提示：
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class LeetCode003 {
    public static void main(String[] args) {

    }


    /**
     * 自己尝试的思路不太行！！！
     * @param s
     * @return
     */
    public static int solution(String s) {
        if (s == "" || s == null) {
            return 0;
        }
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            map.put(s.charAt(i),i);
            for (int j = i + 1; j < len; j++) {
                if (map.containsKey(s.charAt(j))){
                    temp = result;
                    result = j - map.get(s.charAt(j));
                }
            }
        }
        return -1;
    }

    /**
     * 滑动窗口思路
     * @param s
     * @return
     */
    public static int solution1(String s) {
        if(s == "" || s == null) {
            return 0;
        }
        return -1;
    }

    public static int solution2(String s) {
        if (s == "" || s == null) {
            return 0;
        }

        return -1;
    }
}
