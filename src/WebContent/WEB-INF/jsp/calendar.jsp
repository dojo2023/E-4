<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>閲覧</title>
<link rel="stylesheet" type="text/css" href="/sobaudon/css/calendar.css">-
</head>
<body>
 <header>
  <!-- ヘッダー（ここから） -->
     <h1 id="logo_login">
       ロゴ
     </h1>
    <h2>
      ~さんの目標体重
    </h2>
    <h2 id="date"></h2>
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
  <main>
    <form method="POST" action="/sobaudon/CalendarServlet" name="calendar_date">
      <input type="hidden" id="calendar_date" value="">
    </form>

    <form name="dateform">
      <select name="monthdate" id="monthdate">
      </select>
    </form>
    <div class="wrapper">
      <!--yyyy年mm月を表示-->
      <h1 id="header"></h1>
      <!--ボタンクリックで移動-->
      <div id="next-prev-button">
        <button id="prev" onclick="prev()"><</button>
        <button id="next" onclick="next()">></button>
      </div>
      <!-- 広告 -->
      <a url=""><img src="" alt="広告"></a>
      <!--カレンダー-->
      <div id="calendar"></div>
    </div>
    <!-- グラフ -->
    <div id="chart_div"></div>
  </main>
<script src=/sobaudon/js/code.jquery.com_jquery-3.7.0.min.js></script>
<script src="/sobaudon/js/calendar.js"></script>
<script src="https://www.gstatic.com/charts/loader.js"></script>
<script src="/sobaudon/js/glaph.js"></script>
</body>
</html>