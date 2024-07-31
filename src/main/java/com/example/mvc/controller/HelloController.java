package com.example.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String getHelloPage(Model model) {
        model.addAttribute("name", new String("Chaman"));
        return "hello";
    }
}
