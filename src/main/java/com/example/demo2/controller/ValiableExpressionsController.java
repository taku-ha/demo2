package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Car;

@Controller
@RequestMapping("/variable-expressions")
public class ValiableExpressionsController {


    @RequestMapping("")
    public String index(Model model) {
        String javascriptStr = "<script>alert('XSSの脆弱性あり');</script>";
        model.addAttribute("name", javascriptStr);

        Car car = new Car(100,"ベンツ",50);
        model.addAttribute("car", car);

        return "variable-expressions";
    }

    
}
