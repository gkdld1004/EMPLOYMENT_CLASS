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
	.goods_receipt {
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

<div class="goods_receipt">
	<h2>입고 페이지</h2>
	<h5>상품 이름 클릭 시 수량 관리로 이동</h5>
	<table border="1" cellspacing="0" cellpadding="10" align="center">
		<thead>
			<tr>
				<td>상품 이름</td>
				<td>수량</td>
			</tr>
		</thead>
		<c:forEach var="dto" items="${list }">
		<tbody>
			<tr>
				<td><a href="${cpath}/update">${dto.goodsname }</td>
				<td>${dto.goodscount }</td>
			</tr>
		</tbody>
		</c:forEach>
	</table>
</div>

</body>
</html>