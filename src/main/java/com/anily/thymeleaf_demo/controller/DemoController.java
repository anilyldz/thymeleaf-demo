package com.anily.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("date", java.time.LocalDateTime.now());
        return "helloWorld";
    }

}
