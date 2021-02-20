<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<main>

<c:if test="${pageContext.request.method == 'GET' }">

	<c:if test="${empty login }">
		<script>
			alert('회원만 작성 가능 !');
			location.replace('${cpath }/login.jsp');
		</script>
	</c:if>


	<form method="POST" enctype="multipart/form-data">
	
	<%--
		JSP 한정 !
			1) GET 방식으로 파라미터만 전송되면, 주소창을 통해서 queryString의 형식으로 전달한다
			
			2) POST 방식으로 파라미터만 전송되면, HTTP request header를 통해서 파라미터가 전송된다
			
			3) 파일을 전송할 때는 HTTP 패킷의 request body에 바이너리 데이터의 형식으로 파일이 전송된다
			
			- request 를 통해서 파라미터를 처리할 수 없다 !!
			- <jsp:setProperty>를 이용한 파라미터 처리가 불가능하다 !!
			- <jsp:setProperty>는 사용자 입력값을 객체 형식으로 처리하기 위한 방법
			- 직접 객체를 만들어서 DAO에게 전송하면 된다
			- MultipartRequest 객체를 생성해서, 나머지 문자열 파라미터를 받아야 한다
			- MultipartRequest 객체를 생성하기 위해서는 request 객체가 필요하기 때문에, request를 함수 호출 인자로 전달
			- 파일 전송 시에는, MultipartRequest 객체를 생성하는 것만으로 파일이 지정한 위치에 업로드된다
	 --%>
	 
		<input type="hidden" name="ipaddr" value="${pageContext.request.remoteAddr }">
		<div>
			<p><input type="text" name="title" placeholder="제목을 입력하세요" autofocus required></p>
			<p><input type="hidden" name="writer" value="${login.idx }"></p>
			<p>${login.username } (${login.userid })</p>
			<div>
				<textarea name="context" placeholder="내용을 입력하세요" rows="20" cols="50" required></textarea>
			</div>
			<p><input type="file" name="uploadFile"></p>
		</div>
		<div>
			<div>
				<input type="submit" value="작성">
			</div>
			<div>
				<input type="button" value="돌아가기" class="btn" onclick="history.go(-1)">
			</div>
		</div>
	</form>
</c:if>

<c:if test="${pageContext.request.method == 'POST' }">
	<% request.setCharacterEncoding("UTF-8"); %>
<%-- 	<jsp:useBean id="write" class="board2.BoardDTO" /> --%>
<%-- 	<jsp:setProperty property="*" name="write"/> --%>
	
	<jsp:useBean id="fileUpload" class="board2.FileUpload" />
	<c:set var="dto" value="${fileUpload.getBoardDTO(pageContext.request) }" />
	<c:set var="idx" value="${boardDAO.insertBoard(dto) }" />
	<c:redirect url="/view.jsp?idx=${idx }&page=1" />

</c:if>

</main>
<%@ include file="footer.jsp" %>