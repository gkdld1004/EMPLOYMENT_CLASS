<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ include file="header.jsp" %>
<main>
<h2>책 추가하기</h2>

<form action="addResult.jsp" method="POST">
	<table>
		<tr>
			<td>책 이름</td>
			<td><input name="name" placeholder="책 이름" required></td>
		</tr>
		<tr>
			<td>저자</td>
			<td><input name="writer" placeholder="저자" required></td>
		</tr>
		<tr>
			<td>출판사</td>
			<td><input name="publisher" placeholder="출판사" required></td>
		</tr>
		<tr>
			<td collspan="2">
				<button>등록</button>
			</td>
		</tr>
	</table>
</form>
</main>
</body>
</html>