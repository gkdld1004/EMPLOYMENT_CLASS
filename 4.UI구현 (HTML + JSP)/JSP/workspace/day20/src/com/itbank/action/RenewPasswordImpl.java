package com.itbank.action;

import java.util.Enumeration;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itbank.member.Hash;
import com.itbank.member.MemberDAO;
import com.itbank.member.MemberDTO;

public class RenewPasswordImpl implements CommandAction {

	private MemberDAO dao = MemberDAO.getInstance();
	
	@Override
	public String doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		return "renewPassword";
	}

	@Override
	public String doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		Enumeration<String> names = request.getParameterNames();
		MemberDTO dto = new MemberDTO();
		
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getParameter(name);
			switch(name) {
			case "userid" : dto.setUserid(value); break;
			case "username" : dto.setUsername(value); break;
			case "email" : dto.setEmail(value); break;
			}
		}
		String newPassword = UUID.randomUUID().toString().replace("-", "").substring(0, 12);
		dto.setUserpw(Hash.getHash(newPassword));
		int row = dao.updatePassword(dto);
		
		if(row == 1) {
			request.setAttribute("row", 1);
			request.setAttribute("password", newPassword);
		}
		
		return "renewPasswordResult";
	}

}
