<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<main>
	<c:set var="dto" value="${upboardDAO.selectOne(param.idx) }"/>
	<c:set var="count" value="${joinboardDAO.countAll(dto.idx) }"/>
	<c:set var="YES" value="${joinboardDAO.selectAnswer(dto.idx) }"/>
	<c:set var="NO" value="${count - YES }"/>
	<c:set var="yesShow" value="${(100 / count) * YES }"/>
	<c:set var="noShow" value="${(100 / count) * NO }"/>
	<c:if test="${NO == 0 && YES == 0 }">
		<c:set var="yesShow" value="50"/>
		<c:set var="noShow" value="50"/>
	</c:if>
	<div>
		<div class="viewTop">
			<div style="float: left; margin-left: 10px; margin-top: 10px;">작성자 : ${dto.name }</div>
			<div style="display: inline-block; margin-left: 500px; margin-top: 10px;">${dto.createDate }</div>
			<div style="text-align: center; font-size: 15pt; font-weight: bold;">
				<p>${dto.context }</p>
			</div>
		</div>
		<div>
			<div style="width: ${yesShow}%; float: left; background-color: skyblue; color: blue; text-align: left;">
				<a href="${cpath }/view.jsp?useridx=${login.idx }&bdidx=${dto.idx }&answer=yes" title="${yesShow }%">YES(${YES })</a>
			</div>
			<div style="width: ${noShow}%; float: right; background-color: pink; color: red; text-align: right;">
				<a href="${cpath }/view.jsp?idx=${dto.idx }" title="${noShow }%">NO(${NO })</a>
			</div>
		</div>
	</div>
	<!-- insertJoinBoard !!!!!!!!!!!!!!!!! -->
</main>