package com.example.demo.api;

import com.example.demo.service.IlyasService;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@RequestMapping("h/*")
@RestController
public class A {
    private final IlyasService ilyasService;
    @Autowired
    public A(IlyasService ilyasService){

        this.ilyasService = ilyasService;
    }

//    @GetMapping
//    public String get(@RequestBody String body, @RequestHeader("accept-language") String lenguage){
//        System.out.println("GET Request lenguage :" + lenguage);
//        System.out.println(body);
//        return "HelloWorld";
//    }
    @GetMapping
    public String get(@RequestBody  String lenguage){
    System.out.println("GET Request lenguage :" + lenguage);
    return ilyasService.getHTML();
}
    @PostMapping
    public String sendHTML(){
        return ilyasService.getHTML();
    }
}
