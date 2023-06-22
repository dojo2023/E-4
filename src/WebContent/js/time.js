/**
 *
 */
'use strict';
var now = new Date();
var year = now.getFullYear();
var month = now.getMonth()+1;
var date = now.getDate();

const output = year + "/" + month + "/" + date;
document.getElementById('time').textContent = output;