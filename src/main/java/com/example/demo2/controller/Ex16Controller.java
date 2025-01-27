package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.User;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex-16")
public class Ex16Controller {

    @Autowired
    private ServletContext application;


    @RequestMapping("")
    public String index() {

        String chat = (String)application.getAttribute("chatlist");

        if(chat == null) {
            List<String> chatList = new ArrayList<>();
            application.setAttribute("chatlist", chatList);
        
        }
        return "ex-16";
    }

    @RequestMapping("")
    public String post(String name, String comment) {

        String chat = (String)application.getAttribute("chatlist");
        User user = new User();
        chatlist.add(user);

        return "ex-16";
    }
}
