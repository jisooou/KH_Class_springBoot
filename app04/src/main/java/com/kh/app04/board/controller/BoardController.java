package com.kh.app04.board.controller;

import com.kh.app04.board.service.BoardService;
import com.kh.app04.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

//    게시글 작성
    @PostMapping("write")
    public int write(BoardVo vo){
        int result = service.write(vo);
//        System.out.println("result = " + result);
        return result;
    }

//    게시글 목록조회
    @GetMapping("list")
    public List<BoardVo> getBoardList(){
        List<BoardVo> voList = service.getBoardList();
//        System.out.println("voList = " + voList);
        return voList;
    }

//    게시글 검색
    @GetMapping("search")
    public List<BoardVo> getBoardList(@RequestParam Map<String, String> paramMap){
        System.out.println("paramMap = " + paramMap);
        List<BoardVo> voList = service.getBoardList(paramMap);
//        System.out.println("voList = " + voList);
        return voList;
    }


}
