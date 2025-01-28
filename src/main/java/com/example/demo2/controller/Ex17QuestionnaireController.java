package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.Ex17Questionnaire;
import com.example.demo2.form.Ex17Form;

@Controller
@RequestMapping("/ex-17")
public class Ex17QuestionnaireController {
    
    @RequestMapping("")
    public String index(Model model) {

        Map<Integer, String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");
        model.addAttribute("hobbyMap", hobbyMap);

        Map<Integer, String> languageMap = new LinkedHashMap<>();
        languageMap.put(1, "Java");
        languageMap.put(2, "PHP");
        languageMap.put(3, "Python");
        model.addAttribute("languageMap", languageMap);

        return "/ex-17/input";
    }


    @ModelAttribute
    public Ex17Form setUpForm() {
        return new Ex17Form();
    }

    @RequestMapping("/create")
    public String create(
        @Validated Ex17Form form
        ,BindingResult result
        ,RedirectAttributes redirectAttributes
        ,Model model
        ) {

        if(result.hasErrors()) {
            return index(model);
        }


        Ex17Questionnaire ex17Questionnaire = new Ex17Questionnaire();

        BeanUtils.copyProperties(form, ex17Questionnaire);

        List<String> hobbyList = new ArrayList<>();
        for(Integer hobbyCode : form.getHobbyList()) {
            switch (hobbyCode) {
                case 1:
                hobbyList.add("野球");
                break;
                case 2:
                hobbyList.add("サッカー");
                break;
                case 3:
                hobbyList.add("テニス");
                break;
            }
        }
        ex17Questionnaire.setHobbyList(hobbyList);

        List<String> languageList = new ArrayList<>();
        for(Integer languageCode : form.getLanguageList()) {
            switch (languageCode) {
                case 1:
                languageList.add("Java");
                break;
                case 2:
                languageList.add("PHP");
                break;
                case 3:
                languageList.add("Python");
                break;
            }
        }
        ex17Questionnaire.setLanguageList(languageList);



        redirectAttributes.addFlashAttribute("ex17Questionnaire", ex17Questionnaire);
        return "redirect:/ex-17/toresult";
    }

    @RequestMapping("/toresult")
    public String toresult() {
        return "/ex-17/result";
    }
}
