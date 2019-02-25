package com.controller;

import com.entity.User;
import com.service.UserProcessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserProcessController {
    @Autowired
    private UserProcessService userProcessService;
    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        User user = new User();
        user.setId(1);
        userProcessService.login(user);
        System.out.println("hello world!");
        return "index";
    }

    @RequestMapping("/thread")
    public String thread(){

        return "index";
    }
}
