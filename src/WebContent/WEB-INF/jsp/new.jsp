<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜新規登録</title>
<!-- ログインcssの挿入 -->
<link rel="stylesheet" href="/sobaudon/css/login.css">
</head>
<body class="newc">
<div class="ln_wrapper">
	<img src="#">
	<div class="login_container">
	<form method="POST" action="/sobaudon/NewServlet">
		<p class="login_p">ID</p>
		<input class="l_text" type="text" name="USER_ID" minlength="5" required placeholder="5~12文字で入力してください。"><br>
		<p class="login_p">Password</p>
		<input class="l_text" type="password" name="PASSWORD" minlength="8" required placeholder="8~20文字で入力してください。" ><br>
		<p class="login_p">ニックネーム</p>
		<input class="l_text" type="text" name="NAME" minlength="2" required placeholder="2~20文字で入力してください。"><br>
		<p class="login_p">身長</p>
		<input class="l_text" type="text" name="HEIGHT" required placeholder="(cm)で小数第1位まで入力してください。"><br>
		<p class="login_p">体重</p>
		<input class="l_text" type="text" name="WEIGHT" required placeholder="(kg)で小数第1位まで入力してください。"><br>
		<p class="login_p">目標体重</p>
		<input class="l_text" type="text" name="TARGET_WEIGHT" required placeholder="(kg)で小数第1位まで入力してください。"><br>
		<p class="error">${error_new}</p><br>
		<p>すべて必須項目です。</p><br>
		<p>規約：本システムの閲覧機能により、登録する写真以外の情報は他ユーザに開示されます。</p><br>

		<!-- onclick～がないとクリックされたと認識しない -->
		<input class="l_button new_button" type="submit" name="SUBMIT" value="登録" onclick="validateForm(event)"><br>

	</form>
	</div>
</div>
</body>
<script src="/sobaudon/js/new.js"></script>
</html>