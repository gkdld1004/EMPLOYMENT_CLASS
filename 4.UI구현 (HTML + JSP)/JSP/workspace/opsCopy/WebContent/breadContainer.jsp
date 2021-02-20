<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>

<% request.setCharacterEncoding("UTF-8"); %>

<c:set var="dao" value="${BreadDAO.selectAll() }"/>

<table style="board: 1px solid black;">
	<thead>
		<tr>
			<td>번호</td>
			<td>빵 이름</td>
			<td>가격</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="dto" items="${dao }">
		<tr>
			<td>${dto.idx }</td>
			<td><a href="${cpath }/view.jsp">${dto.bname }</a></td>
			<td>${dto.bprice }</td>
		</tr>
	</c:forEach>	
	</tbody>
</table>

</main>

<%@ include file="footer.jsp" %>