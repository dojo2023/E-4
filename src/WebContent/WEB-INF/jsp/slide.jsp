<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>スライドショー画面</title>
<link rel="stylesheet" type="text/css" href="/sobaudon/css/slide.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/header.css">
<link rel="stylesheet" type="text/css" href="/sobaudon/css/title.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!--  <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

<script type="text/javascript">
        $(document).ready(function(){
            $('.slider').bxSlider({
                auto: true,
                pause: 5000,
            });
        });
</script>-->

</head>
<body>
<%@ include file="header.jsp" %>
<script type="text/javascript" src="/sobaudon/js/slide.js"></script>

<div class="position">
  <div>写真の日付</div>
</div>
<article>
  <div class="advertisement"><img src="./img/advertisement.png"></div>
    <div class="slider">
         <c:forEach var="e" items="${manageSlideList}" >
           <div class="slider img"><img src="${e.picture}"></div>
            </c:forEach>
            <img src="./img/titletest.png">
            <img src="./img/test1.png">
            <img src="./img/titletest.png">
      </div>
      <!-- <div class="slider">
<img src="./img/titletest.png" width="500" height="300" alt="">
<img src="./img/test1.png" width="500" height="300" alt="">
<img src="./img/titletest.png" width="500" height="300" alt="">
<img src="./img/test1.png" width="500" height="300" alt="">
</div>-->
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
<!-- JavaScript（ここから）
<script>
'use strict'

let temperature;

$(function() {
	 $('.slider').each(function() {
	   // スライド（画像）の数を取得
	   var $slides = $(this).find('img'),
	       slideNum = $slides.length,
	       currentIdx = 0; // 何番目か

	   // 最初の画像をフェードイン
	   $(".slider img").eq(currentIdx).fadeIn();

	   // 3秒後に次のスライドを表示
	   setTimeout(dispNextSlide, 3000);

	   // 次のスライドを表示するメソッド
	   function dispNextSlide() {
	     var nextIdx = currentIdx + 1;

	     // 最後のスライドの場合ははじめに戻る
	     if (nextIdx > (slideNum - 1)) {
	       nextIdx = 0
	     }

	     // 現在のスライドをフェードアウト
	     $(".slider img").eq(currentIdx).fadeOut();

	     // 次のスライドをフェードイン
	     $(".slider img").eq(nextIdx).fadeIn();

	     // インデックスを更新
	     currentIdx = nextIdx;
	   }
	 });
	});


</script>
<!-- JavaScript（ここまで） -->
<%@ include file="title.jsp" %>
<%@ include file="footer.jsp" %>
</body>
</html>