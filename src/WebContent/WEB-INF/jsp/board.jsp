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
<link rel="stylesheet" type="text/css" href="/sobaudon/css/board.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/header.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/title.css">
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
<c:forEach var="e" items="${list}" >

	ニックネーム:<c:out value="${e.name}"></c:out>　<br>
	<c:out value="${e.date}"></c:out>　投稿内容:<c:out value="${e.chattext}"></c:out><br>
	
<!-- 
	<table class="List">
	<tr>
	<td>ニックネーム<input type="text" name="NAME" value="${e.name}"></td>
	<td>投稿内容<input type="text" name="CHATTEXT" value="${e.chattext}"></td>
	<td>日付<input type="text" name="DATE" value="${e.date}"></td>
	</tr>
	</table>
 -->	<br>
	<hr>
	<br>
</c:forEach>


<form action="/sobaudon/BoardServlet" method="post" name="form1"> <!-- onSubmit="return check()" -->
<div class = "rw">
<!--テキストエリアに入力があったらチェックを行う関数を用意する。-->
<p>コメント:<br>
<textarea name="chattext" rows="5" cols="40" onChange="check()"></textarea>
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
function check()
{
    //②次にその関数内でテキストエリアの値を取得。
    txt = document.form1.chattext.value;
    //③その後、その文字列の文字数を取得。
    n = txt.length;
    //④最後にその文字数が制限文字数以上だった場合、アラートを実行。
    if (n > 200) alert("200文字以内で入力してください");
}
/*
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
    saveDate.innerText = `初回保存 ${nowYear}/${nowMon}/${nowDate} ${nowHour}:${nowMinute}`;*/
    
</script>
</body>
</html>
