package com.example.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//声明为控制层的一个组件
public class MyController {

    @GetMapping("/name")
    //接受get请求的一个方法
    public Map get(){
        return Map.of("name","cyc");
    }
}
