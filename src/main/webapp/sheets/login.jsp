<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<div id="wrap">
	<h1>악보게시판 - 로그인</h1>
	
	<form action="./loginCtrl.jsp" method="post">
		<fieldset>
			<legend>로그인</legend>
		
		<ul>
			
			<li>
				<label for="userid">아이디</label>
				<input type="text" id="userid" name="userid" value="dowon" />
			</li>
			
			<li>
				<lable for="password">비밀번호</lable>
				<input type="password" id="password" value="1234" />

			</li>
		
		</ul>
		
		</fieldset>
		<p><button>확인</button></p>

	
	</form>

</div>
</body>
</html>