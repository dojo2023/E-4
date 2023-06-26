<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html dir="ltr">
<head>
<script src="slide.js"></script>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>スライドショー画面</title>
<link rel="stylesheet" type="text/css" href="/sobaudon/css/slide.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/header.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/title.css">


</head>
<body>
<%@ include file="header.jsp" %>
<script type="text/javascript" src="/sobaudon/js/slide.js"></script>

<div class="position">
<c:forEach var="e" items="${manageSlideList}" >
  <div><input class="b" type="hidden" value="2023/06/26"></div>
  </c:forEach>
  <p id="date">日付</p>
</div>
<article>
  <div class="advertisement"><img src="./img/advertisement.png"></div>
    <div class="slider">
         <c:forEach var="e" items="${manageSlideList}" >
           <input class="slider img" type="hidden" value="${e.picture}">
            </c:forEach>
            <img decoding="async" id="mypic" src="" width="400" height="300">
      </div>

  <div class="button">
        <input class="button1" id="btnResume" type="button" value="開始">
        <input class="button1" id="btnPause" type="button" value="停止">
        <input class="button1"  id="reset" type="button" value="リセット">
        <select class="button1"   name="selectbox" id="select_box">
          <option id="fast" value="500">早い</option>
          <option id="normal" value="1000" selected>普通</option>
          <option id="slow" value="1500">遅い</option>
        </select>
  </div>
</article>


<%@ include file="title.jsp" %>
<%@ include file="footer.jsp" %>
</body>
</html>