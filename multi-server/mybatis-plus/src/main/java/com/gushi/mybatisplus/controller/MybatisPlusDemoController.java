package com.gushi.mybatisplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/4/6
 */
@RequestMapping("/")
@RestController
public class MybatisPlusDemoController {

    @GetMapping("/")
    public String getInfo() {
        return null;
    }
}
