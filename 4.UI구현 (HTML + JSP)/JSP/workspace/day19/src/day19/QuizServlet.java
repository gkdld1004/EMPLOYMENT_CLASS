package day19;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member2.MemberDAO;
import member2.MemberDTO;

public class QuizServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private MemberDAO dao = MemberDAO.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("../quiz.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
		MemberDTO user = new MemberDTO();
		user.setUserid(userid);
		user.setUserpw(userpw);
		
		MemberDTO login  = dao.selectOne(user);
		req.setAttribute("login", login);		// JSP 에서 EL Tag로 받아서 화면에 출력한다 
		
		req.getRequestDispatcher("../quizResult.jsp").forward(req, resp);
		
	}
	
}
