package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex19")
public class CalculationController {

    @RequestMapping("")
    public String index() {
        return "/ex19/input";
    }


}
