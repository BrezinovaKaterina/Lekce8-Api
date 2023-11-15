package com.engeto.ApiHomework.controller;

import com.engeto.ApiHomework.response.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")

public class MainController {

    @GetMapping("/hello")  //localhost:8080/hello
    public String hello(){
        return "Hello ladies";
    }

    @GetMapping("/hello-int")
    public int helloInt() {
        return 54;
    }
}
