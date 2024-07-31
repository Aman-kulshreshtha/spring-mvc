package com.example.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String getHelloPage(Model model) {
        model.addAttribute("name", "Chaman");
        model.addAttribute("list", Arrays.asList("Aman","Suhani","Random"));
        return "hello";
    }

    @RequestMapping("/greetings")
    public ModelAndView greetings() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Aman");
        modelAndView.setViewName("greetings");
        return modelAndView;
    }
}
