package com.kh.app.member.service;

import com.kh.app.member.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

//    //    Autowired - 자동으로 Dao에 연결해주는 작업
    @Autowired
    private MemberDao dao;

    public MemberService(){
        System.out.println("MemberService.MemberService 생성자 호출됨@@@@");
    }

    public int join(){
        System.out.println("MemberService.join called~~~~~~");
        int result = dao.join();
        return result;
    }
}
