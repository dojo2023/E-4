<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから｜プロフィール</title>
<!-- ログインcssの挿入 -->
<link rel="stylesheet" href="/sobaudon/css/login.css">
</head>
<body>
<%@ include file="header.jsp" %>
<div class="lp_wrapper">
	<form method="POST" action="/sobaudon/ProfileServlet">
		<p class="login_p">ID</p>
		<input class="l_text" type="text" name="USER_ID" value="${profile.user_id}" readonly><br>
		<p class="login_p">Password</p>
		<input class="l_text" type="password" name="PASSWORD" value="${profile.password}" readonly><br>
		<p class="login_p">ニックネーム</p>
		<input class="l_text" type="text" name="NAME" minlength="2" value="${profile.name}"><br>
		 <!-- required placeholder="2~20文字で入力してください。" -->
		<p class="login_p">身長</p>
		<input class="l_text" type="text" name="HEIGHT" placeholder="(cm)で小数第1位まで入力してください。" value="${profile.height}"><br>
		<p class="login_p">体重</p>
		<input class="l_text" type="text" name="WEIGHT" value="${profile.weight}" readonly><br>
		<p class="login_p">目標体重</p>
		<input class="l_text" type="text" name="TARGET_WEIGHT" placeholder="(kg)で小数第1位まで入力してください。" value="${profile.target_weight}"><br>

		<!-- onclick～がないとクリックされたと認識しない -->
		<input class="l_button new_button" type="submit" name="SUBMIT" value="登録" onclick="validateForm(event)" ><br>
	</form>
</div>
<%@ include file="title.jsp" %>
<%@ include file="footer.jsp" %>
</body>
</html>