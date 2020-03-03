package com.example.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//注解声明是一个SpringBoot配置类
public class SpringbootHelloworldApplication {

    public static void main(String[] args) {
        //基于SpringBoot的配置类启动SpringBoot，自带微型tomcat
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
    }

}
