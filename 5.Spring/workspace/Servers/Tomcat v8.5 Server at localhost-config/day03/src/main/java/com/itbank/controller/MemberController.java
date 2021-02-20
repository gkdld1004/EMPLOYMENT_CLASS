package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.member.MemberDAO;
import com.itbank.member.MemberDTO;

@Controller
public class MemberController {

	@Autowired
	private MemberDAO memberDAO;		
	// 객체 참조변수가 초기화되지 않았지만, @Autowired 에 의해서 객체 (스프링 빈)를 참조한다
	
	@GetMapping("memberList")
	public ModelAndView memberList() {
		ModelAndView mav = new ModelAndView("memberList");
		
		List<MemberDTO> memberList = memberDAO.selectMemberAll();
		
		mav.addObject("memberList", memberList);
		
		return mav;		// response 
	}
	
	@GetMapping("memberList2")
	public ModelAndView memberList2() {
		ModelAndView mav = new ModelAndView("memberList");
		
		List<MemberDTO> memberList = memberDAO.selectMemberAll2();
		
		mav.addObject("memberList", memberList);
		
		return mav;
	}
	
	@GetMapping("insertMember")
	public void inserMember() {}
	
	@PostMapping("insertMember")
	public ModelAndView insertMember(MemberDTO user) {
		ModelAndView mav = new ModelAndView();
		
		int row = memberDAO.insertMember(user);
		
		mav.setViewName(row == 1 ? "redirect:/memberList2" : "redirect:/insertMember");
		
		return mav;
	}
}
