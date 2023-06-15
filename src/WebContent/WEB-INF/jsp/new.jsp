<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜新規登録</title>
<div class="login_wrapper">
	<img src="#">
	<form method="POST" action="/sobaudon/LoginServlet.java">
		<p class="login_p">ID</p>
		<input type="text" name="user_id" required><br>
		<p class="login_p">Password</p>
		<input type="password" name="password" required><br>
		<p class="login_p">ニックネーム</p>
		<input type="text" name="name" required><br>
		<p class="login_p">身長</p>
		<input type="password" name="height" required><br>
		<p class="login_p">体重</p>
		<input type="text" name="weight" required><br>
		<p class="login_p">目標体重</p>
		<input type="password" name="target_weight" required><br>

		<p>すべて必須項目です。</p>
		<p>規約：</p>

		<!-- onclick～がないとクリックされたと認識しない -->
		<input type="submit" name="LOGIN" value="登録" onclick="validateForm(event)"><br>
	</form>
</div>"
</head>
<body>

</body>
</html>