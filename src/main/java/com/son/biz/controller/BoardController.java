package com.son.biz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.son.biz.board.BoardService;
import com.son.biz.board.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/main.do")
	public String selectAllBoard(BoardVO vo,ModelAndView mav){
		List<BoardVO> bDatas=boardService.selectAllBoard(vo);
		mav.addObject("bDatas", bDatas);
		return "main.jsp";
	}
	@RequestMapping(value="/selectOneBoard.do")
	public String selectOneBoard(BoardVO vo,ModelAndView mav){
		vo=boardService.selectOneBoard(vo);
		mav.addObject("bData", vo);
		return "detail.jsp";
	}
	
}
