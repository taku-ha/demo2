package com.example.demo2.domain;

import java.util.List;

public class Ex17Questionnaire {
    private String name;
    private String email;
    private String gender;
    private List<String> hobbyList;
    private List<String> languageList;
    private String comment;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    

    
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public List<String> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }
    
    
}
