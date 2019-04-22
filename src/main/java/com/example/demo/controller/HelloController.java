package com.example.demo.controller;

import com.example.demo.version.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tu_pei on 2019/4/19.
 */
@RestController
@RequestMapping(("/{version}/hello"))
public class HelloController {

    @ApiVersion(1)
    @RequestMapping("/index")
    public String index1(String name){

        return " version 1.0";

    }

    @ApiVersion(3)
    @RequestMapping("/index")
    public String index3(String name){

        return " version 3.0";

    }

    @ApiVersion(10)
    @RequestMapping("/index")
    public String index10(String name){

        return " version 10.0";

    }

    @ApiVersion(20)
    @RequestMapping("/index")
    public String index20(String name){

        return " version 20.0";

    }

}
