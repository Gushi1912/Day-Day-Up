package com.gushi.tacocloud.controller;

import com.gushi.tacocloud.domain.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Gushi1912
 * @date 2021/2/1
 */
@Slf4j
@RequestMapping("/orders")
@Controller
public class OrderController {

    @GetMapping("/current")
    public String orderForm(Model model) {
        model.addAttribute("order",new Order());
        return "orderForm";
    }

    @PostMapping()
    public String processOrder(Order order) {
        log.info("Order submitted: {}",order);
        return "redirect:/";
    }

}
