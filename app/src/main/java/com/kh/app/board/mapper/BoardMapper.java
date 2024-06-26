package com.kh.app.board.mapper;

import com.kh.app.board.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM BOARD")
    List<BoardVo> getBoardList();

}
