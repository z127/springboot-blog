package com.oscar.springbootblog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oscar
 * @description:
 * @date 2022/9/10 16:38
 */


@RestController
public class testController {

    /**
     * RESTFUL:GET,POST,PUT,DELETE
     *
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return "controller is :"+UserdefinedValue;
    }


    @PostMapping("/hello/post")
    public String helloPost(String result){
        return "Post:"+result;
    }

    //read the application.properties value ,default_controller is the default value
    @Value("${test.result:default_controller}")
    private String UserdefinedValue;

}

