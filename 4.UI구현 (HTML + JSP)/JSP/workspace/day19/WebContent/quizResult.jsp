<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>quiz - loginResult</h1>
<hr>  

<h2>${login.username }님 ${empty login ? '로그인 실패' : '로그인 성공' }</h2>
<button onclick="history.go(-1)">뒤로 가기</button>

	<script>
		const userid = '${login.userid}';
		const username = '${login.username}';
		
		if(userid !== '' && username !== '') {
			alert(username + '(' + userid + ') 님 로그인 성공 !!');
		}
		else {
			alert('로그인 실패!! 다시입력 !! ');
		}
	</script>



</body>
</html>