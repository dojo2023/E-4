<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スライドショー画面</title>
<link rel="stylesheet" type="text/css" href="/sobaudon/css/slide.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/header.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/title.css">
</head>
<body>
<a href="/sobaudon/RegistrationServlet" style="padding-bottom:0;">
  <img src="/img/logo.png" style="width:100px" />
</a>
<div class="position">
  <c:forEach var="e" items="${manageSlideList}" >
    <div class="slider-item"><img src="${e.date}"></div>
  </c:forEach>
  <div class="achievement">称号（right: 0;）</div>
</div>
<article>
  <div class="advertisement"><img src="./img/advertisement.png"></div>
  <div class="slider">
        <div class="slider-inner">
        <c:forEach var="e" items="${manageSlideList}" >
           <!-- <div class="slider-item"><img src="${e.picture}"></div> -->
            </c:forEach>
            <div class="slider-item"><img src="./img/test1.png"></div>
           <div class="slider-item"><img src="./img/test1.png"></div>
           <div class="slider-item"><img src="./img/test1.png"></div>
        </div>
  </div>
  <div class="button">
    <button id="startBtn" class="button1">開始</button>
    <button id="stopBtn" class="button1">停止</button>
    <input type="button" value="リセット" class="button1">
    <select name="spead" id="spead" class="button1">
      <option value="遅い">遅い</option>
      <option value="速い">速い</option>
      <option value="すごい速い">すごい速い</option>
    </select>
  </div>
</article>
<!-- JavaScript（ここから） -->
<script>
'use strict'

let temperature;

const stopBtn = document.getElementById('stopBtn')
const startBtn = document.getElementById('startBtn')
const sliders = document.querySelectorAll('.slide-inner')

stopBtn.addEventListener('click', function() {
   sliders.forEach( function(slider){
      slider.style.animation = 'none';
});
}, false);
startBtn.addEventListener('click', function() {
   sliders.forEach( function(slider){
      slider.style.animation = 'animation: slider 10s infinite ease';
});
}, false);


</script>
<!-- JavaScript（ここまで） -->
</body>
</html>