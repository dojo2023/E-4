<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜ログイン画面</title>
<!-- ログインcssの挿入 -->
<link rel="stylesheet" href="/sobaudon/css/login.css">
</head>

<body>
<div class="login_wrapper">
<h1>きょうから(仮)</h1>
<!-- <img src="#">-->
	<div class="login_container">
	<form method="POST" action="/sobaudon/LoginServlet">
		<p class="login_p">ID</p>
		<input class="lt_text" type="text" name="USER_ID"><br>
		<p class="login_p">Password</p>
		<input class="lt_text" type="password" name="PASSWORD"><br>
		<!-- onclick～がないとクリックされたと認識しない -->
		<input class="l_button" type="submit" name="LOGIN" value="ログイン" onclick="validateForm(event)"><br>
		<p class="error">${error}</p>
	</form>
	<form method="GET" action="/sobaudon/NewServlet">
	<input class="l_button ln_button" type="submit" name="NEW" value="新規登録はこちら" >
	</form>
	</div>
</div>
</body>
</html>