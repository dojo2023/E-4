
// class名"a"の要素を取得
const elements = document.getElementsByClassName('slide img');
const elementsd = document.getElementsByClassName('b');

let paused = true;  // 開始、停止用
let num = -1;        // 配列の要素番号用
let n = 1;          // setIntervalのID用
let speed = 1000;   // スライドショーの速度(ミリ秒)
let elem = document.getElementById('select_box');


// slideshow_timerメソッド
function slideshow_timer(){
  if (num === elements.length - 1){
    num = 0;
  }
  else {
    num ++;
  }
  document.getElementById("mypic").src = elements[num].value;
  document.getElementById("date").innerHTML = elementsd[num].value;
}

// 初期のスライドショーの起動
let timer = setInterval(function(){
  if (paused) {
    console.log("一時停止");
    return;
  }

  slideshow_timer()}, speed);

// 停止ボタンを押したとき
document.getElementById('btnPause').onclick = function(){
    paused = true;
}

// 開始ボタンを押したとき
document.getElementById('btnResume').onclick = function(){
  paused = false;
}

// リセットボタンを押したとき
document.getElementById('reset').onclick
= function(){
  clearInterval(n);           // setIntervalのIDを入れることでsetIntervalを削除
  n++;                        //console.log(n);
  num = elements.length - 1;  // 配列の先頭の要素を取り出す
  paused = true;              // 停止状態にする
  document.getElementById("mypic").src = null; //初期値の画像を挿入
  document.getElementById("date").innerHTML = "日付"; //初期値の日付テキストを挿入

  timer = setInterval(function(){ // 再度setIntervalを呼び出す
    if (paused) {
      console.log("一時停止");
      return
    }
    slideshow_timer()}, speed);
}
// 速度変更
elem.addEventListener('change', function(){
  speed = elem.value; // console.log(speed);
});