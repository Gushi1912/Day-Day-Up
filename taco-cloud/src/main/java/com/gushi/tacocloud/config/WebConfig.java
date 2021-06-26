package com.gushi.tacocloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Gushi1912
 * @date 2021/6/26
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //视图控制器，addViewController会针对传入的路径执行GET请求，setViewName会跳转到指定的视图
        registry.addViewController("/").setViewName("home");
    }
}
