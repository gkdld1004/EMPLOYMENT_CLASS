<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%	request.setCharacterEncoding("UTF-8"); %>
<c:set var="dto" value="${dao.selectOne(param.idx) }" />
<main>
	<c:if test="${pageContext.request.method == 'GET' }">
	<form method="POST">
		<input type="hidden" name="idx" value="${param.idx }">
		<input type="hidden" name="ipaddr" value="${pageContext.request.remoteAddr }">
		<div class="viewBoard">
			<p class="boardTitle"><input type="text" name="title" value="${dto.title }" placeholder="제목을 입력하세요" autofocus required></p>
			<p><input type="text" name="writer" value="${dto.writer }" placeholder="작성자를 입력하세요"></p>
			<div class="boardContext">
				<textarea name="context" placeholder="내용을 작성하세요">${dto.context }</textarea>
			</div>
		</div>
		<div class="wrap">
			<div>
				<button onclick="history.go(-1)">돌아가기</button>
			</div>
			<div>
				<button>수정</button>
			</div>
		</div>
	</form>
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">

		<jsp:useBean id="modify" class="board1.BoardDTO" />
		<jsp:setProperty property="*" name="modify" />
		
		<c:set var="idx" value="${dao.updateBoard(modify) }" />
		
		<c:redirect url="/view.jsp?idx=${idx }" />
	</c:if>
</main>
<%@ include file="footer.jsp" %>








