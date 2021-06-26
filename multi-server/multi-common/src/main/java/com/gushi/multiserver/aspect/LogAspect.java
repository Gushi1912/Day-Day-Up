package com.gushi.multiserver.aspect;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/3/15
 */


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类，打印日志
 */
@Aspect
@Component
public class LogAspect{

    @Pointcut("@annotation(com.gushi.multiserver.annotatioin.Log)")
    public void log() {
    }

    @Around("log()")
    public void printLog(ProceedingJoinPoint joinpoint) {
        //获取方法名称
        String name = joinpoint.getSignature().getName();
        //获取入参
        Object[] params = joinpoint.getArgs();

        StringBuilder log = new StringBuilder();
        for (Object param : params) {
            log.append(params + "; ");
        }
        System.out.println("进入" + name + "的参数为：" + log.toString());
        try {
            joinpoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(name + "方法执行结束");
    }
}
