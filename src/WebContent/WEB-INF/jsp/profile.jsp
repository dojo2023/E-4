<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜プロフィール</title>
<!-- ログインcssの挿入 -->
<link rel="stylesheet" href="/sobaudon/css/login.css">
</head>
<body>
<div class="lp_wrapper">
	<img src="#">
	<div class="login-container">
	<form method="POST" action="/sobaudon/ProfileServlet">
		<p class="login_p">ID</p>
		<input class="l_text" type="text" name="user_id" value="${user_id}"><br>
		<p class="login_p">Password</p>
		<input class="l_text" type="password" name="password" value="${password}"><br>
		<p class="login_p">ニックネーム</p>
		<input class="l_text" type="text" name="name" minlength="2" required placeholder="2~20文字で入力してください。"><br>
		<p class="login_p">身長</p>
		<input class="l_text" type="password" name="height" required placeholder="(cm)で小数第1位まで入力してください。"><br>
		<p class="login_p">体重</p>
		<input class="l_text" type="text" name="weight" value="${weight}"><br>
		<p class="login_p">目標体重</p>
		<input class="l_text" type="password" name="target_weight" required placeholder="(kg)で小数第1位まで入力してください。"><br>

		<!-- onclick～がないとクリックされたと認識しない -->
		<input class="l_button new_button" type="submit" name="SUBMIT" value="登録" onclick="validateForm(event)"><br>
	</form>
	</div>
</div>
</body>
</html>