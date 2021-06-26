package com.gushi.multiserver.annotatioin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/3/15
 */

/**
 * 自定义注解的使用
 * Target表示注解的使用范围
 * Retention表示注解的保留级别，RUNTIME表示运行态也保留
 * 注解的定义形式和接口一样，只不过表示的含义不一样，注解里的抽象方法表示注解的属性值。
 *
 * 自定义注解的常用范围
 * 作为权限注解，限制权限和interceptor结合使用
 * 和AOP结合使用实现日志打印，当然也可以直接使用AOP来实现日志打印
 */
@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequest {
    String value() default "";

}
