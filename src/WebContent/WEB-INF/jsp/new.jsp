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
<div class="ln_wrapper">
	<img src="#">
	<div class="login_container">
	<form method="POST" action="/sobaudon/NewServlet">
		<p class="login_p">ID</p>
		<input class="l_text" type="text" name="user_id" minlength="5" required placeholder="5~12文字で入力してください。"><br>
		<p class="login_p">Password</p>
		<input class="l_text" type="password" name="password" minlength="8" required placeholder="8~20文字で入力してください。" ><br>
		<p class="login_p">ニックネーム</p>
		<input class="l_text" type="text" name="name" minlength="2" required placeholder="2~20文字で入力してください。"><br>
		<p class="login_p">身長</p>
		<input class="l_text" type="password" name="height" required placeholder="(cm)で小数第1位まで入力してください。"><br>
		<p class="login_p">体重</p>
		<input class="l_text" type="text" name="weight" required placeholder="(kg)で小数第1位まで入力してください。"><br>
		<p class="login_p">目標体重</p>
		<input class="l_text" type="password" name="target_weight" required placeholder="(kg)で小数第1位まで入力してください。"><br>

		<p>すべて必須項目です。</p><br>
		<p>規約：</p><br>

		<!-- onclick～がないとクリックされたと認識しない -->
		<input class="l_button new_button" type="submit" name="SUBMIT" value="登録" onclick="validateForm(event)"><br>
	</form>
	</div>
</div>
</body>
</html>