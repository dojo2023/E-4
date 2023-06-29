<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>きょうから | 閲覧</title>
<link rel="stylesheet" type="text/css" href="/sobaudon/css/calendar.css">
</head>
<body id="other">
  <header>
	<%@ include file="header.jsp" %>
  </header>
  <main>
	<c:forEach var="e" items="${lg}">
	  <input class="data" type="hidden" value="${e.date}">
      <input class="data" type="hidden" value="${e.dayweight}">
      <input class="data" type="hidden" value="${e.bmi}">
	</c:forEach>
	<p>${profile2.name}さんの記録</p>

    <form method="POST" action="/sobaudon/OtherinfServlet" name="calendar_date">
      <input type="hidden" id="calendar_date" name="calendar" value="">
      <input type="hidden" name="else_user" value="${profile2.user_id}">
    </form>


    <form name="dateform">
      <!-- プルダウン -->
      <select name="monthdate" id="monthdate">
      </select>
    </form>

    <div class="wrapper">
      <!-- <p class="inf">日付をクリックするとその日の登録ページに飛べます。</p>-->
      <!--yyyy年mm月を表示-->
      <h1 id="header"></h1>
      <!--ボタンクリックで移動-->
      <div id="next-prev-button">
        <button id="prev" onclick="prev()"><</button>
        <button id="next" onclick="next()">></button>
      </div>

      <!-- 広告 ページ残したまま飛ぶ -->
      <a href="https://www.seplus.jp/" target="_blank"><img src="./img/advlevelup.png" alt="広告" class="ad"></a>

      <!--カレンダー-->
      <div id="calendar"></div>
    </div>

    <!-- グラフ -->
    <div id="chart_div"></div>
  </main>
  <%@ include file="title.jsp" %>
  <%@ include file="footer.jsp" %>
<script src=/sobaudon/js/code.jquery.com_jquery-3.7.0.min.js></script>
<script src="/sobaudon/js/calendar.js"></script>
<script src="https://www.gstatic.com/charts/loader.js"></script>
<script src="/sobaudon/js/glaph.js"></script>
</body>
</html>