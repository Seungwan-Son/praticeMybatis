<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="login.do" method="post">
		<input type="text" name="mid">
		<input type="text" name="mpw">
		<input type="submit" value="login">
	</form>
	
	<a href="signUp.jsp">회원가입</a>
</body>
</html>