<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜プロフィール</title>
<!-- ログインcssの挿入 -->
<link rel="stylesheet" href="/sobaudon/css/login.css">
<link rel="stylesheet" href="/sobaudon/css/title.css">
</head>
<body>
<div class="lp_wrapper">
	<div class="login-container">
	<form method="POST" action="/sobaudon/ProfileServlet">
		<p class="login_p">ID</p>
		<input class="l_text" type="text" name="user_id" value="${loginUser.user_id}"><br>
		<p class="login_p">Password</p>
		<input class="l_text" type="password" name="password" value="${loginUser.password}"><br>
		<p class="login_p">ニックネーム</p>
		<input class="l_text" type="text" name="name" minlength="2" required placeholder="2~20文字で入力してください。"><br>
		<p class="login_p">身長</p>
		<input class="l_text" type="text" name="height" required placeholder="(cm)で小数第1位まで入力してください。"><br>
		<p class="login_p">体重</p>
		<input class="l_text" type="text" name="weight" value="${loginUser.weight}"><br>
		<p class="login_p">目標体重</p>
		<input class="l_text" type="text" name="target_weight" required placeholder="(kg)で小数第1位まで入力してください。"><br>

		<!-- onclick～がないとクリックされたと認識しない -->
		<input class="l_button new_button" type="submit" name="SUBMIT" value="登録" onclick="validateForm(event)"><br>
	</form>
	</div>
</div>

<div class="title">
	<table class="ctitle">
		<tr>
		<td id="tn">レジェンド</td>
		<td rowspan="2"><img src="./img/titletest.png"></td>
		</tr>
		<tr>
		<td id="tl">87pt</td>
		</tr>
	</table>
</div>
</body>
<%-- <script src="/sobaudon/js/profile.js"></script> --%>
</html>