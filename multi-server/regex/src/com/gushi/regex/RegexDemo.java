package com.gushi.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/3/19
 */
public class RegexDemo {
    public static void main(String[] args) {

        String str = "There are some phone numbers 917-555-1234.Also,you can call me at 646.555.1234 and of course I'm" +
                "always reachable at (212)867-5309";
        String s = test1(str);
        System.out.println(s);
    }

    private static String test1(String str) {
        String regex = "";
        return getMatchStr(str, regex);
    }

    private static String getMatchStr(String str, String regex){
        Matcher matcher = Pattern.compile(regex).matcher(str);
        System.out.println(matcher);
        matcher.find();
        return matcher.group();
    }
}
