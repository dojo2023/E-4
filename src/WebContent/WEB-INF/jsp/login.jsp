<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜ログイン画面</title>
<!-- ログインcssの挿入 -->
<link rel="stylesheet" href="/sobaudon/WebContent/css/login.css">
</head>

<body>
<div class="login-wrapper">
<img src="#">
	<form method="POST" action="/sobaudon/LoginServlet.java">
		<p>ID</p>
		<input type="text" name="ID"><br>
		<p>Password</p><br>
		<input class="round" type="password" name="PW"><br>
		<!-- onclick～がないとクリックされたと認識しない -->
		<input type="submit" name="LOGIN" value="ログイン" onclick="validateForm(event)"><br>
		<input type="submit" name="LOGIN" value="新規登録はこちら" ><br>
	</form>
</div>
</body>
<script src="/WEB-Content/login.js"></script>
</html>