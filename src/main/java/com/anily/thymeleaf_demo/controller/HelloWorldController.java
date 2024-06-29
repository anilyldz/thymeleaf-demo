package com.anily.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String helloWorld(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloWorld";
    }

    @RequestMapping("/makeUpperCase")
    public String makeUpperCase(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String message = "Hello " + name;

        model.addAttribute("message", message);

        return "helloWorld";
    }


}
