package com.anily.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String helloWorld(){
        return "helloworld-form";
    }


}
