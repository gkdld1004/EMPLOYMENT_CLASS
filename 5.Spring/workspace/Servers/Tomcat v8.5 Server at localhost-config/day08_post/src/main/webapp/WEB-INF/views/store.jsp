<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매 페이지</title>
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

<h2 style="text-align: center;">판매 & 결제 페이지</h2>

<div style="display: flex; width: 100%;">
	<div style="display: flex; flex-flow: wrap; width: 100%;">
		<c:forEach var="dto" items="${list }">
			<button style="width:160px;">
				${dto.goodsname }<br>
				${dto.goodsprice }원
			</button>
		</c:forEach>
	</div>
	<div style="width: 100%; height: 750px; display: flex; justify-content: center; align-items: flex-end;">
		<form method="POST" style="width: inherit; height: inherit;">
			<div style="border: 2px solid black; width: inherit; height: 100%;">
				<div style="display: flex; justify-content: space-between; width: 100%; border-bottom: 2px solid black;">
					<div>상품 이름</div>
					<div>상품 수량</div>
					<div>상품 가격</div>
				</div>
				<div>상품 리스트</div>
			</div>
			<br>
			<div style="text-align: center;">
				<input type="submit" value="결제">
			</div>
		</form>
	</div>
</div>

</body>
</html>