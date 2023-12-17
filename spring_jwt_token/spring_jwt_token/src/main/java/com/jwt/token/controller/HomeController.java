package com.jwt.token.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

//    /home/user


    @GetMapping("/user")
    public String getUser(){
        return "getUseers";

}

}
