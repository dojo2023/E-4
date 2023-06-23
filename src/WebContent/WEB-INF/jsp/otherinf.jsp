<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>きょうから | 他人情報</title>
	<!-- 登録っぽい系css挿入 -->
	<link rel="stylesheet" href="/sobaudon/css/registration.css">
</head>
<body>
<!-- ヘッダー -->
	<%@ include file="header.jsp" %>
<!-- 選択した日付 -->
	<div >選択した日付</div>
<!-- ~~さんの情報 -->
	<div>[nickname]さんの情報</div>
<!-- 広告 -->
	<a url="">
		<img src="" alt="広告">
	</a>
<main>
<form method="GET" action="/sobaudon/RegistrationServlet.java">
<c:forEach var="other" items="${otherInfo}" >
	<table class="regi_table">
		<tr>
			<th>朝</th>
			<td>
			<div class=bf_eat_form>
				<label><input id="reg_check" type="checkbox" name="BF_SE_ST" value="1" class="check">主食</label>
				<label><input type='hidden' value='0' name='BF_SE_ST'></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_MA" value="1" class="check">主菜</label>
				<label><input type='hidden' value="0" name="BF_SE_MA"></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_SI" value="1" class="check">副菜</label>
				<label><input type='hidden' value="0" name="BF_SE_SI"></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_NO" value="1" class="check">たべていない</label>
				<label><input type='hidden' value="0" name="BF_SE_NO"></label>
				<label><input id="reg_check" type="checkbox" name="BF_SE_OT" value="1" class="check">その他</label><br>
				<label><input type='hidden' value="0" name="BF_SE_OT"></label>
			</div>
				<input class="eat_text" type="text" maxlength="100" name="BFTEXT">
			</td>
		</tr>
		<tr>
			<th>昼</th>
			<td>
			<div class=lc_eat_form>
				<label><input id="reg_check" type="checkbox" name="LC_SE_ST" value="1" class="check">主食</label>
				<label><input type='hidden' value="0" name="LC_SE_ST"></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_MA" value="1" class="check">主菜</label>
				<label><input type='hidden' value="0" name="LC_SE_MA"></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_SI" value="1" class="check">副菜</label>
				<label><input type='hidden' value="0" name="LC_SE_SI"></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_NO" value="1" class="check">たべていない</label>
				<label><input type='hidden' value="0" name="LC_SE_NO"></label>
				<label><input id="reg_check" type="checkbox" name="LC_SE_OT" value="1" class="check">その他</label><br>
				<label><input type='hidden' value="0" name="LC_SE_OT"></label>
			</div>
				<input class="eat_text" type="text" maxlength="100" name="LCTEXT">
			</td>
		</tr>
		<tr>
			<th>夜</th>
			<td>
			<div class=dn_eat_form>
				<label><input id="reg_check" type="checkbox" name="DN_SE_ST" value="1" class="check">主食</label>
				<label><input type='hidden' value="0" name="DN_SE_ST"></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_MA" value="1" class="check">主菜</label>
				<label><input type='hidden' value="0" name="DN_SE_MA"></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_SI" value="1" class="check">副菜</label>
				<label><input type='hidden' value="0" name="DN_SE_SI"></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_NO" value="1" class="check">たべていない</label>
				<label><input type='hidden' value="0" name="DN_SE_NO"></label>
				<label><input id="reg_check" type="checkbox" name="DN_SE_OT" value="1" class="check">その他</label><br>
				<label><input type='hidden' value="0" name="DN_SE_OT"></label>
			</div>
				<input class="eat_text" type="text" maxlength="100" name="DNTEXT">
			</td>
		</tr>

		<tr>
		<th>運動</th>
			<td>
				<label><input type="radio" name="EXERCISE" value="1">あり</label>
				<label><input type="radio" name="EXERCISE" value="0">なし</label>
			</td>
		<th>飲酒</th>
			<td>
				<label><input type="radio" name="DRINK" value="1">あり</label>
				<label><input type="radio" name="DRINK" value="0">なし</label>
			</td>
		<th>間食・夜食</th>
			<td>

				<label><input type="radio" name="SNACK" value="1">あり</label>
				<label><input type="radio" name="SNACK" value="0">なし</label>
			</td>
		</tr>

		<tr>
		<th>体重</th>
			<td>
				<input class="reg_text" type="text" name="DAYWEIGHT">
			</td>
		<th>bmi</th>
			<td>
				<input class="reg_text" type="text" name="BMI" disabled>
			</td>
		<th>写真</th>
			<td>
				<input type="file" name="PICTURE" width="100" height="150">
			</td>
		</tr>
	</table>
</c:forEach>
</form>
</main>
<!-- 称号 -->
	<%@ include file="title.jsp" %>
<!-- 前回の称号 -->
	<div class="achivement">前回の称号</div>
<!-- フッター -->
	<%@ include file="footer.jsp" %>
</body>
</html>