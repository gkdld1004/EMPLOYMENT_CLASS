package com.itbank.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itbank.member.MemberDAO;

public class FindActionImpl implements CommandAction {

	private MemberDAO dao = MemberDAO.getInstance();
	
	@Override
	public String doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		return "findMyId";
	}

	@Override
	public String doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable {
	
		// 1) 파라미터로 전달된 데이터를 수집하여
		Map<String, String[]> map = request.getParameterMap();
		
		// 2) DB에게 전달하여 일치하는 ID가 있는지 확인
		String findID = dao.selectID(map);
		
		// 3) 문자열을 받아와서 jsp에게 전달 (간단한 코드라면, response에 직접 작성해도 무방)
		String code = "";
		response.setContentType("text/html; charset=utf-8");
		if(findID != null) {
			code = "" 
					+ "<script>"
					+ " alert('%s님의 ID는 %s입니다');"
					+ " location.replace('%s/login');"
					+ "</script>";
			code = String.format(code, map.get("username")[0], findID, request.getContextPath());
			
		}
		else {
			code = "" 
					+ "<script>"
					+ " alert('일치하는 ID를 찾을 수 없습니다');"
					+ " location.replace('" + request.getContextPath() + "/findMyId');"
					+ "</script>";
		}
		response.getWriter().print(code);
		return null;
	
//		MemberDTO user = new MemberDTO();
//		
//		user.setUsername(request.getParameter("username"));
//		user.setEmail(request.getParameter("email"));
//		
//		MemberDTO dto = dao.findMyId(user);
//		request.setAttribute("find", dto);
//		
//		return "login";
		
	}

}
