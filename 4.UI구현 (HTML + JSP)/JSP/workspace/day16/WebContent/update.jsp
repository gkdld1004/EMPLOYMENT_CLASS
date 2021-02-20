<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<% request.setCharacterEncoding("UTF-8"); %>

<c:set var="dto" value="${boardDAO.selectOne(param.idx) }" />

<main>

<c:if test="${pageContext.request.method == 'GET' }">
<form method="POST">
	<input type="text" name="idx" value="글 번호 : ${param.idx }" readonly>
	<input type="text" name="ipaddr" value="IP주소 : ${pageContext.request.remoteAddr }" readonly>
	<p><input type="text" name="title" value="${dto.title }" ></p>
	<div>
		<input type="file" name="updateFile">
	</div>
	<div>
		<textarea name="context">${dto.context }</textarea>
	</div>
	<div>
		<input type="button" value="돌아가기" onclick="history.go(-1)">
		<button>수정완료</button>
	</div>
</form>
</c:if>

<c:if test="${pageContext.request.method == 'POST' }">
	<jsp:useBean id="modify" class="board2.BoardDTO" />
	<jsp:setProperty property="*" name="modify"/>
	
	<c:set var="idx" value="${boardDAO.update(modify) }" />
	
	<c:redirect url="/view.jsp?idx=${dto.idx }" />S
</c:if>

</main>
<%@ include file="footer.jsp" %>