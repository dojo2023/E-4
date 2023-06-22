<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- ヘッダーcssの挿入 -->
<link rel="stylesheet" href="/sobaudon/css/header.css">
</head>
<body>
<header>
	<img class="header_img" src="#" alt="きょうから">
	<div class="header_top">
		<p><span>${profile.name}</span>さんの目標体重は<span>${profile.target_weight}</span>kgです。</p>
		<div class="header_right">
		<a class="logout l_header" href="/sobaudon/LoginServlet">ログアウト</a>
		<p class="day" id="time"></p>
		</div>
	</div>
	<div class="header_bottom">
		<nav>
			<ul>
				<li><a class="l_header" href="/sobaudon/RegistrationServlet">登録</a></li>
      			<li><a class="l_header" href="/sobaudon/CalendarServlet">カレンダー</a></li>
      			<li><a class="l_header" href="/sobaudon/SlideServlet">スライドショー</a></li>
      			<li><a class="l_header" href="/sobaudon/BoardServlet">掲示板</a></li>
      			<li><a class="l_header" href="/sobaudon/HelpServlet">ヘルプ</a></li>
      			<li><a class="l_header" href="/sobaudon/ProfileServlet">プロフィール</a></li>
			</ul>
		</nav>
	</div>
</header>
</body>
<script src="/sobaudon/js/time.js"></script>
</html>