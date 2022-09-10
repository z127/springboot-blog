package com.oscar.springbootblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//it can help scan the class inside the com.oscar. the default is the SpringbootBlogApplication related directory
//@ComponentScan({"com.oscar",})
@SpringBootApplication
public class SpringbootBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBlogApplication.class, args);
    }

}
