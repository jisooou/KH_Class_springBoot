package com.kh.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("hi")
    public void m01(){
        System.out.println("Hello.m01");
    }

}
