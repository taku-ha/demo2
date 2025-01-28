package com.example.demo2.form;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Ex17Form {

    @Size(min = 1, max = 127, message = "値を入力してください、1桁以上127桁以下で入力してください")
    private String name;

    @Size(min = 1, max = 127, message = "1桁以上127桁以下で入力してください")
    @Email
    private String email;

    @NotEmpty(message = "値を入力してください")
    private String gender;

    @NotEmpty(message = "値を入力してください")
    private List<Integer> hobbyList;


    private List<Integer> languageList;

    @Size(min = 1, max = 2000, message = "1桁以上2000桁以下で入力してください")
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
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }


    
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public List<Integer> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(List<Integer> languageList) {
        this.languageList = languageList;
    }
    

    
}
