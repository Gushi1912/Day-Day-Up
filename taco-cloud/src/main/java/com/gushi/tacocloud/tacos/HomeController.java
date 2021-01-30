package com.gushi.tacocloud.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Gushi1912
 * @date 2021/1/27
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        //返回的是视图名
        return "home";
    }
}
