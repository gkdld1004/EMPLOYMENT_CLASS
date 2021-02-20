<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<h2>jQuery를 이용한 AJAX</h2>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- 자바스크립트를 보다 짧고 간편하게 사용하기 위해서 불러와서 선언 후 / ajax를 쓰기 위해 따로 모아 놓은 것 -->

<fieldset>
	<input id="btn1" type="button" value="ajax Test 1"> : 
	<span id="result1"></span>
</fieldset>

<fieldset>
	<input id="btn2" type="button" value="ajax Test 2"> : 
	<span id="result2"></span>
</fieldset>

<script>
// 	$('#btn1').click(function(){});
// 	btn1을 클릭하면 함수가 실행된다.

	$('#btn1').click(function(){
		$.ajax({
			url: '${pageContext.request.contextPath}' + '/ajax1',	// 어디로 주소를 요청하는가
			method: 'GET',				// 어떤 방식으로
			dataType: 'text',			// 어떤 타입으로
			success: function(data){	// 반환함수
				$('#result1').html(data);		
				// document.getElementById(result).innerHTML = data;
			}
		});
	});
	
	$('#btn2').click(function(){
		$.ajax({
			url: '${pageContext.request.contextPath}' + '/ajax2',	
			method: 'GET',				
			dataType: 'text',			
			success: function(data){	
				$('#result2').html(data);		
			}
		});
	});
	
	
</script>

</body>
</html>