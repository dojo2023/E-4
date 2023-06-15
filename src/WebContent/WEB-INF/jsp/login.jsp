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
<div class="login_wrapper">
<img src="#">
	<form method="POST" action="/sobaudon/LoginServlet">
		<p class="login_p">ID</p>
		<input class="l_text" type="text" name="user_id"><br>
		<p class="login_p">Password</p>
		<input class="l_text" type="password" name="password"><br>
		<!-- onclick～がないとクリックされたと認識しない -->
		<input type="submit" name="LOGIN" value="ログイン" onclick="validateForm(event)"><br>
		<input type="submit" name="NEW" value="新規登録はこちら" >
	</form>
</div>
</body>
<script src="/WEB-Content/login.js"></script>
</html>