/**
 *
 */
'use strict'
/*ログインボタンを押したときの処理*/

function validateForm(event) {
  var id = document.getElementsByName("user_id")[0].value;
  var pw = document.getElementsByName("password")[0].value;
  if (id === "" || pw === "") {
    event.preventDefault();
    alert("IDまたはPasswordが誤っています");
	return false;
	}
}