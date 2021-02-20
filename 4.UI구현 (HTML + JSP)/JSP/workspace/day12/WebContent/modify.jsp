<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
<%@ include file="header.jsp" %>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<c:set var="dao" value="<%=BoardDAO.getInstance() %>" />
<c:set var="dto" value="${dao.selectOne(param.idx) }" />

<h1><a href="${pageContext.request.contextPath }/">게시물 보기</a></h1>
<hr>

<c:if test="${pageContext.request.method == 'GET' }">
	<form method="POST">
	<table border="1" cellpadding="10" cellspacing="0" >
		<tr><td>제목</td><td><input name="title" value="${dto.title }"></td></tr>
		<tr><td>작성자</td><td><input name="writer" value="${dto.writer }"></td></tr>
		<tr><td>내용</td><td><textarea name="context" rows="20" style="width: 100%;">${dto.context }</textarea></td></tr>
		<tr><td>작성날짜</td><td>${dto.creationDate }</td></tr>
		<tr><td>조회수</td><td>${dto.viewCount }</td></tr>
		<tr><td>IP Address</td><td>${dto.ipaddr }</td></tr>
	</table>
	<div>
		<input type="hidden" value="${dto.idx }" >
		<input type="hidden" value="${dto.ipaddr }">
		<input type="hidden" value="${dto.writer }">
		<input type="hidden" value="${dto.creationDate }">
		<input type="hidden" value="${dto.viewCount }">
		<input type="submit" value="수정완료">
	</div>
	</form>
</c:if>

<c:if test="${pageContext.request.method == 'POST' }" >
	<jsp:useBean id="dto" class="board1.BoardDTO" />
	<jsp:setProperty property="*" name="dto" />
	<c:set var="row" value="${dao.update(dto) }" />
	<c:redirect url="/view.jsp?idx=${param.idx }" />
</c:if>



</body>
</html>