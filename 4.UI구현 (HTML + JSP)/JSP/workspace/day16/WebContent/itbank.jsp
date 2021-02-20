<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<main>
<fieldset>
	<legend><h2>SQL 제약조건</h2></legend>
	<ul style="list-style: none;">
		<li><b>NOT NULL : NULL 값으로 데이터를 생성할 수 없다</b></li>
		<li><b>UNIQUE : 다른 레코드와 중복을 허용하지 않는다</b></li>
		<li><b>PRIMARY KEY : 중복을 허용하지 않으면, NULL 값으로 데이터를 생성할 수 없다</b></li>
		<li><b>FOREIGN KEY : 다른 테이블의 PK를 참조하는 키, 참조 대상 테이블의 PK가 없으면 데이터를 생성할 수 없다</b></li>
	</ul>
</fieldset>

<fieldset>
	<legend><h2>SQL 외래키 사용 현황</h2></legend>
	<ul style="list-style: none;">
		<li><b>board2.writer -> member2.idx : 회원목록에 있는 사용자만 게시글의 작성자로 등록할 수 있다</b></li>
		<li><b>reply2.idx -> board2.idx : 게시글이 있어야 댓글을 달 수 있다</b></li>
		<li><b>reply2.writer -> member2.idx : 회원목록에 있는 사용자만 댓글의 작성자로 등록할 수 있다</b></li>
	</ul>
</fieldset>
</main>