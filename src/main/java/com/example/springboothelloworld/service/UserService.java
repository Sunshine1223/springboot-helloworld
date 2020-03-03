package com.example.springboothelloworld.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
//声明为spring的一个组件
public class UserService {
    public int add(int x, int y) {
        return x + y;
    }

    public void addString(String str) {
        //通过List.of()创建一个集合，往里添加str
        //List.of()返回的是一个不可变集合，往里添加元素会产生异常
        List.of("df").add(str);
    }
}
