<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>掲示板</title>
<link rel="stylesheet" href="/sobaudon/webcontent/css/board.css">
</head>
<body>
<header>
	<!-- ヘッダー（ここから） -->
	<h1 id="logo_login">
		ロゴ
	</h1>
	<a href="/sobaudon/LoginServlet">ログアウト</a>
	<ul>
		<li><a href="/sobaudon/RegistrationServlet">登録</a></li>
		<li><a href="/sobaudon/CalendarServlet">カレンダー</a></li>
		<li><a href="/sobaudon/SlideServlet">スライドショー</a></li>
		<li><a href="/sobaudon/BoardServlet">掲示板</a></li>
		<li><a href="/sobaudon/HelpServlet">ヘルプ</a></li>
		<li><a href="/sobaudon/ProfileServlet">プロフィール</a></li>
	</ul>
	<!-- ヘッダー（ここまで） -->
</header>
<div class = "bssinf">
	<c:forEach var="list" items="${listAttribute}">
	<p>
	<%--名前--%><c:out value="${list.name}"/>：　
	<%--訪問数--%><c:out value="${list.visiter}"/>：　
	<%--日付--%><c:out value="${list.time}"/>：　<br>
	<%--投稿内容--%><c:out value="${list.chattext}"/>：　</p>
	</c:forEach>
</div>
<form action="/sobaudon/BoardServlet" method="post" name="form1" onSubmit="return check()">
<div class = "rw">
<p>コメント:<br>
<textarea name="chattext" rows="5" cols="40"></textarea>
</p>
<p class="savebtn"><input type="submit" value="送信"><input type="reset" value="リセット"></p>
</div>
</form>



<div class="title">
	<table>
		<tr>
		<td id="tn">レジェンド</td>
		<td rowspan="2"><img src="./img/titletest.png"></td>
		</tr>
		<tr>
		<td id="tl">pt</td>
		</tr>
	</table>
</div>
<script>
//button要素を取得
const saveBtn = document.querySelector('.save_btn');

//div要素を取得
const saveDate = document.querySelector('.save_date');
const updateDate = document.querySelector('.update_date');


saveBtn.addEventListener('click', () =< {

    //buttonがクリックされた時点の日時情報を取得
    const now = new Date();
    const nowYear = now.getFullYear(); 
    const nowMon = now.getMonth() + 1;
    const nowDate = now.getDate();
    const nowHour = now.getHours();
    const nowMinute = now.getMinutes();

    //div要素（保存日時）のテキストとして表示
    saveDate.innerText = `初回保存 ${nowYear}/${nowMon}/${nowDate} ${nowHour}:${nowMinute}`;
</script>
</body>
</html>
