package com.itbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.member.MemberDTO;
import com.itbank.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService ms;
	
	@GetMapping("login")
	public void login() {}
	
	@PostMapping("login")
	public String login(MemberDTO user, HttpSession session) {
		
		MemberDTO dto = ms.login(user);
		
		if(dto != null) {
			session.setAttribute("login", dto);
			return "redirect:/";
		}
		
		return "redirect:/login";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		return "redirect:/";
	}
	
}
