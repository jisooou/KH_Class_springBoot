<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로월드</title>

</head>
<body>
	<h1>로그인 ~</h1>

  <form action="/member/login" method="post">
    <br>
    <input type="text" name="id">
    <br>
    <input type="password" name="pwd" placeholder="비밀번호 입력">
    <br>
    <input type="submit" value="로그인">
  </form>
</body>
</html>