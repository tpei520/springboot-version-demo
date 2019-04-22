package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tu_pei on 2019/4/19.
 */
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String index(String name){

        return " hello : " + name ;

    }
}
