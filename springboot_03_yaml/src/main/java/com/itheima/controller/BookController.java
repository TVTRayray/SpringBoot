package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {


//读取yaml配置文件的数据

//    基本单一数据类型
    @Value("${country}")
    private String country;

//    单一数组
    @Value("${likes[1]}")
    private String likes1;

//    对象
    @Value("${userA.name}")
    private String name;

//    对象数组
    @Value("${users[1].name}")
    private String name1;

    @GetMapping
    public String getById(){
        System.out.println("springboot is running");
        System.out.println(country);
        System.out.println(likes1);
        System.out.println(name);
        System.out.println(name1);
        return "springboot is running";
    }
}
