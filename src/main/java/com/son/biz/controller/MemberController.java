package com.son.biz.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.son.biz.member.MemberService;
import com.son.biz.member.MemberVO;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(MemberVO vo,HttpSession session) {
		vo=memberService.selectOneMemberVO(vo);
		if(vo==null) {
			return "redirect:login.jsp";
		}
		else {
			session.setAttribute("mid", vo.getMid());
			return "redirect:main.do";
		}
	}
	
	@RequestMapping(value="/signUp.do",method=RequestMethod.POST)
	public String insertMember(MemberVO vo) {
		memberService.insertMember(vo);
		
		return "redirect:login.jsp";
	}
	
	
}
