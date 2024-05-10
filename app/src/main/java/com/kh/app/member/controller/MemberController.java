package com.kh.app.member.controller;

import com.kh.app.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Controller가 있으니 Spring이 이 아이를 객체로 자동 인식함.
@Controller
public class MemberController {

//    Autowired - 자동으로 Service에 연결해주는 작업
    @Autowired
    private MemberService ms;

    public MemberController(){
        System.out.println("MemberController.MemberController 생성자 호출됨@@@@@");
    }

    @GetMapping("join")
    public void join(){
        System.out.println("MemberController.join ~~~~~");
        int result = ms.join();
        System.out.println("result = " + result);
    }

    @GetMapping("login")
    public void login(){
        System.out.println("MemberController.login ~~~~~");
    }

    @GetMapping("edit")
    public void edit(){
        System.out.println("MemberController.edit ~~~~~");
    }

    @GetMapping("quit")
    public void quit(){
        System.out.println("MemberController.quit ~~~~~");
    }

}
