package com.zwc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/test")
    public String test(Integer i){
        i = 10 ;
        return "Hello,SpringBoot";
    }
}
