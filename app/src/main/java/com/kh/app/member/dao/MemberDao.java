package com.kh.app.member.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    public MemberDao() {
        System.out.println("MemberDao.MemberDao 생성자 호출됨@@@@@");
    }

    public int join(){
//        SQL

        System.out.println("MemberDao.join called~~~~");

        return 1;

    }

}
