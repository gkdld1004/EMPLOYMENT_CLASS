<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<main>
	<c:if test="${pageContext.request.method == 'GET' }">
	<form method="POST">
		<input type="hidden" name="ipaddr" value="${pageContext.request.remoteAddr }">
		<div class="viewBoard">
			<p class="boardTitle"><input type="text" name="title" placeholder="제목을 입력하세요" autofocus required></p>
			<p><input type="text" name="writer" placeholder="작성자를 입력하세요"></p>
			<div class="boardContext">
				<textarea name="context" placeholder="내용을 작성하세요"></textarea>
			</div>
		</div>
		<div class="wrap">
			<div>
				<button onclick="history.go(-1)">돌아가기</button>
			</div>
			<div>
				<button>작성</button>
			</div>
		</div>
	</form>
	</c:if>
	
	<c:if test="${pageContext.request.method == 'POST' }">
		<%	request.setCharacterEncoding("UTF-8"); %>
		<jsp:useBean id="write" class="board1.BoardDTO" />
		<jsp:setProperty property="*" name="write" />
		
		<%--새 글을 작성하고 새로 작성된  글의 idx를 반환하게 처리했음--%>
		<c:set var="idx" value="${dao.insertBoard(write) }" />
		
		<c:redirect url="/view.jsp?idx=${idx }" />
	</c:if>
</main>
<%@ include file="footer.jsp" %>








