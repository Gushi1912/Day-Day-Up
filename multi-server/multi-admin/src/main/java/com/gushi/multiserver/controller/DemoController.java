package com.gushi.multiserver.controller;

import com.gushi.multiserver.annotatioin.Log;
import com.gushi.multiserver.annotatioin.LoginRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/2/25
 */
@RequestMapping("/")
@RestController
public class DemoController {

    @GetMapping("/aaa")
    @Log
    public String loginA(String name) {
        System.out.println(name);
        return "你正在访问资源A";
    }

    @GetMapping("/bbb")
    @LoginRequest()
    @Log
    public String loginB() {
        return "你正在访问资源B";
    }


}
