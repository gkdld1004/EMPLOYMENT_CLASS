<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1Result.jsp</title>
<style>
	table {
		border-collapse: collapse;
	}
	table, tr, td, th {
		border: 1px solid black;
	}
	td, th {
		padding: 5px;
	}
</style>
</head>
<body>
<h1>NAVER 회원가입 폼 예시</h1>
<hr>

<table>
<%
	Map<String, String[]> params3 = request.getParameterMap();
	Set<String> names3 = params3.keySet();
	
	String userpw = "", userpw2 = "";
	
	for(String name : names3) {
		String[] valueArr = params3.get(name);	// 파라미터 맵에서 값을 가져온다
		
		out.print("<tr>");
		
		for(int i = 0; valueArr != null && i < valueArr.length; i++) {
			if("userpw".equals(name)) {
				userpw = valueArr[i];
			}
			if("userpw2".equals(name)) {
				userpw2 = valueArr[i];
			}
			out.print("<td>" + name + "</td><th>" + valueArr[i] + "</th>");	
		}
		out.print("</tr>");
		
	}
	if(userpw.equals(userpw2) == false) {
		out.print("<h1>비밀번호가 서로 다르잖아 !!</h1>");
	}
%>
</table>

</body>
</html>