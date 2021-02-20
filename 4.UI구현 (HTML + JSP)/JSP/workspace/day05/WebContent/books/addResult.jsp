<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>
<main>
등록처리

<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="newbie" class="day05.Books" />
<jsp:setProperty property="*" name="newbie"/>

<%
	ArrayList<Books> list = (ArrayList<Books>)application.getAttribute("list");
	boolean add = list.add(newbie);
	pageContext.setAttribute("add", add);	
%>
<script>
	if(false){
		const add = <%=pageContext.getAttribute("add") %>;
		if(add){
			alert('책 등록 성공 !');
			location.href='/day05/';
		}
		else {
			alert('책 등록 실패 !');
			history(-1);
		}
	}
</script>

</main>
</body>
</html>