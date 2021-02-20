<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 보기</title>
<%@ include file="header.jsp" %>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>

<c:set var="dao" value="<%=BoardDAO.getInstance() %>" />
<c:set var="dto" value="${dao.selectOne(param.idx) }" />
<c:set var="vo" value="${dao.updateVC(param.idx) }" />

<h1><a href="${pageContext.request.contextPath }/">게시물 보기</a></h1>
<hr>
<table border="1" cellpadding="10" cellspacing="0">
	<tr><td>제목</td><td>${dto.title }</td></tr>
	<tr><td>작성자</td><td>${dto.writer }</td></tr>
	<tr><td>내용</td><td><textarea readonly name="context" rows="20" style="width: 100%;">${dto.context }</textarea></td></tr>
	<tr><td>작성날짜</td><td>${dto.creationDate }</td></tr>
	<tr><td>조회수</td><td>${dto.viewCount } </td></tr>
	<tr><td>IP Address</td><td>${dto.ipaddr }</td></tr>
</table>
	${vo.updateVC(dto.idx) }
<br>

<div>
	<a href="${cpath }/modify.jsp?idx=${param.idx}"><button>수정</button></a>         
	<button id="deleteBtn">삭제</button>
</div>

<br>
<a href="${pageContext.request.contextPath }/"><button>목록으로</button></a>

<script>
	const deleteBtn = document.getElementById('deleteBtn');
	
	deleteBtn.onclick = () => {
		const answer = confirm('${dto.title } 게시물을 삭제하시겠습니까 ?');
		if(answer){
			location.replace('delete.jsp?idx=${dto.idx}');
		}
	}
</script>

</body>
</html>