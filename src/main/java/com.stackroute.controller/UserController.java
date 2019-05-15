package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @PostMapping("/save")
    public ModelAndView getName(HttpServletRequest name){
        String str= name.getParameter("hello");

        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("name",str);
        return modelAndView;
    }
}