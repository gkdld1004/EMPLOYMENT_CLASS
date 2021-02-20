<%@page import="java.util.ArrayList"%>
<%@page import="day05.Books" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books Sample</title>
<style>
	a {
		text-decoration: none;
		color: inherit;
		display: block;
	}
	a:hover {
		border-bottom: 1px solid black;
	}
	nav {
		display: flex;
		justify-content: center;
	}
	ul {
		list-style: none;
	}
	li {
		display: inline-block;
		text-align: center;
		width: 150px;
		height: 25px;
		font-size: 14pt;
		font-weight: blod;
	}
	.logo {
		width: 100%;
		display: flex;
		justify-content: center;
		align-content: center;
	}
</style>
</head>
<body>
<%
	Object ob = application.getAttribute("list");


	if(ob == null){
		ArrayList<Books> list = new ArrayList<Books>();
		application.setAttribute("list", list);
	}
%>

<header>
	<div class="logo">
		<h1><a href="/day05/">Books Sample</a></h1>
		<div></div>
	</div>
	<nav>
		<ul>
			<li><a href="/day05/books/booksList.jsp">책 목록</a></li>
			<li><a href="/day05/books/booksAdd.jsp">책 추가</a></li>
			<li><a>책 수정</a></li>
			<li><a>책 검색</a></li>
			<li><a>책 삭제</a></li>
		</ul>
	</nav>
</header>
<hr>