package com.gushi.multiserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/2/26
 */

@SpringBootTest(classes = MultiAdminTests.class)
public class MultiAdminTests {

    //test1和test2是为了测试maven插件maven-surefire-plugin
    @Test
    public void test1() {
        System.out.println("Hello gugugu");
    }

    @Test
    public void test2() {
        System.out.println("Hello xioagu");
    }

    @Test
    public void testRegex() {
        String str = "abc123def";
        Pattern compile = Pattern.compile("([0-9]+)");
        Matcher matcher = compile.matcher(str);
        if (matcher.find()){
            String group = matcher.group(1);
            System.out.println(group);
        }




    }

    @Test
    public void testToHex() {
        BigInteger bigInteger = BigInteger.valueOf(1000);
        String s = bigInteger.toString(16).toUpperCase();
        System.out.println(s);
    }

    @Test
    public void testJNIPath() {
        String property = System.getProperty("java.library.path");
        System.out.println(property);
    }
}
