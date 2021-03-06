<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>편의점 계산대 프로그램</title>
<style>
	a {text-decoration: none; color: black;	}
	a:hover {text-decoration: underline;}
	header {
		text-align: center;
	}
	nav > ul {
		list-style: none;
		display: flex;
		justify-content: center;
	}
	nav > ul > li {
	display: flex;
	width: 200px;
	height: 50px;
	justify-content: center;
	align-items: center;
	font-size: 12pt;
	font-weight: bold;
	}
	h2 {
		text-align: center;
	}
	.update {
		text-align: center;
	}
</style>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath">${pageContext.request.contextPath }</c:set>

<header>
	<h1>
		<a href="${cpath }/">itbank CVS</a>
	</h1>
	<div class="loginInfo">
		<strong>
		${login.username } 
		${not empty login ? '(' : '' }
		${login.userid }
		${not empty login ? ')' : '' }
		</strong>
	</div>
</header>

<nav>
	<ul>
		<li>
			<a href="${cpath }/${not empty login ? 'logout' : 'login' }">
				${not empty login ? '로그아웃' : '로그인' }
			</a>
		</li>
		<li>
			<a href="${cpath }/receipt">상품 입고</a>
		</li>
		<li>
			<a href="${cpath }/store">판매</a>
		</li>
		<li>
			<a href="${cpath }/">매출 집계</a>
		</li>
	</ul>
</nav>

<h2>수량 관리</h2>

<div class="update">
	<form method="POST">
		<input type="text" placeholder="제품이름 들어갈자리 ~">
		<input type="text" placeholder="현재수량 들어갈자리 ~">
		<input type="text" placeholder="변경할수량 들어갈자리 ~">
		<input type="submit" value="완료">	
	</form>
</div>


</body>
</html>