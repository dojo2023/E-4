/**
 *
 */
 'use strict'
/*登録ボタンを押したときの処理*/

function validateForm(event) {
  var id = document.getElementsByName("user_id")[0].value;
  var pw = document.getElementsByName("password")[0].value;
  var name = document.getElementsByName("name")[0].value;
  var height = document.getElementsByName("height")[0].value;
  var weight = document.getElementsByName("weight")[0].value;
  var target_weight = document.getElementsByName("target_weight")[0].value;
  if (id === "" || pw === "" || name === "" || height === "" || weight === "" || target_weight === "") {
    event.preventDefault();
    alert("すべて必須項目です。");
	return false;
	}
}