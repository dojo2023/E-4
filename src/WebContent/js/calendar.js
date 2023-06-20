const week = ["日", "月", "火", "水", "木", "金", "土"];
const today = new Date();
// 月末だとずれる可能性があるため、1日固定で取得
var showDate = new Date(today.getFullYear(), today.getMonth(), 1);

// 初期表示
window.onload = function () {
    showProcess(today, calendar);
};



// 選んだ日付を選択
function addOption(){
    let monthdate = document.getElementById("monthdate");
    let option1 = document.createElement("option");
    let option2 = document.createElement("option");
    let option3 = document.createElement("option");
    let option4 = document.createElement("option");
    let option5 = document.createElement("option");
    let option6 = document.createElement("option");
    let option7 = document.createElement("option");
    let option8 = document.createElement("option");
    let option9 = document.createElement("option");
    let option10 = document.createElement("option");
    let option11 = document.createElement("option");
    let option12 = document.createElement("option");
    if ((showDate.getMonth() + 1) > 0) {
        option1.text = showDate.getFullYear() +"/"+ (showDate.getMonth() + 1);
        option1.value = showDate.getMonth();
        monthdate.add(option1);
    } else {
        option1.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 1);
        option1.value = showDate.getMonth();
        monthdate.add(option1);
    }
    if (showDate.getMonth() > 0) {
        option2.text = showDate.getFullYear() +"/"+ showDate.getMonth();
        option2.value = showDate.getMonth() + 1;
        monthdate.add(option2);
    } else {
        option2.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 12);
        option2.value = showDate.getMonth() + 1;
        monthdate.add(option2);
    }
    if ((showDate.getMonth() - 1) > 0) {
        option3.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 1);
        option3.value = showDate.getMonth() + 2;
        monthdate.add(option3);
    } else {
        option3.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 11);
        option3.value = showDate.getMonth() + 2;
        monthdate.add(option3);
    }
    if ((showDate.getMonth() - 2) > 0) {
        option4.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 2);
        option4.value = showDate.getMonth() + 3;
        monthdate.add(option4);
    } else {
        option4.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 10);
        option4.value = showDate.getMonth() + 3;
        monthdate.add(option4);
    }
    if ((showDate.getMonth() - 3) > 0) {
        option5.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 3);
        option5.value = showDate.getMonth() + 4;
        monthdate.add(option5);
    } else {
        option5.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 9);
        option5.value = showDate.getMonth() + 4;
        monthdate.add(option5);
    }
    if ((showDate.getMonth() - 4) > 0) {
        option6.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 4);
        option6.value = showDate.getMonth() + 5;
        monthdate.add(option6);
    } else {
        option6.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 8);
        option6.value = showDate.getMonth() + 5;
        monthdate.add(option6);
    }
    if ((showDate.getMonth() - 5) > 0) {
        option7.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 5);
        option7.value = showDate.getMonth() + 6;
        monthdate.add(option7);
    } else {
        option7.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 7);
        option7.value = showDate.getMonth() + 6;
        monthdate.add(option7);
    }
    if ((showDate.getMonth() - 6) > 0) {
        option8.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 6);
        option8.value = showDate.getMonth() + 7;
        monthdate.add(option8);
    } else {
        option8.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 6);
        option8.value = showDate.getMonth() + 7;
        monthdate.add(option8);
    }
    if ((showDate.getMonth() - 7) > 0) {
        option9.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 7);
        option9.value = showDate.getMonth() + 8;
        monthdate.add(option9);
    } else {
        option9.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 5);
        option9.value = showDate.getMonth() + 8;
        monthdate.add(option9);
    }
    if ((showDate.getMonth() - 8) > 0) {
        option10.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 8);
        option10.value = showDate.getMonth() + 9;
        monthdate.add(option10);
    } else {
        option10.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 4);
        option10.value = showDate.getMonth() + 9;
        monthdate.add(option10);
    }
    if ((showDate.getMonth() - 9) > 0) {
        option11.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 9);
        option11.value = showDate.getMonth() + 10;
        monthdate.add(option11);
    } else {
        option11.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 3);
        option11.value = showDate.getMonth() + 10;
        monthdate.add(option11);
    }
    if ((showDate.getMonth() - 9) > 0) {
        option12.text = showDate.getFullYear() +"/"+ (showDate.getMonth() - 10);
        option12.value = showDate.getMonth() + 11;
        monthdate.add(option12);
    } else {
        option12.text = (showDate.getFullYear() - 1) +"/"+ (showDate.getMonth() + 2);
        option12.value = showDate.getMonth() + 11;
        monthdate.add(option12);
    }
}
function option(hoge){
    showDate.setMonth(today.getMonth() + today.getMonth() - hoge);
    showProcess(showDate);
    showDate.setMonth(showDate.getMonth());
    if (showDate.getFullYear() != today.getFullYear()) {
        showDate.setFullYear(today.getFullYear())
    }
    return showDate;
}
addOption();
    let select = document.querySelector('[name="monthdate"]');
    select.onchange = event => {
    option(select.value);
    let str = document.querySelector('#header').textContent
    var cut1 = str.substr(0, str.indexOf('年'));
}

// 前の月を表示
function prev() {
    let str = document.querySelector('#header').textContent;
    var cut1 = str.substr(0, str.indexOf('年'));
    if (cut1 == showDate.getFullYear()) {
        showDate.setMonth(showDate.getMonth() - 1);
        showProcess(showDate);
    } else {
        showDate.setFullYear(parseInt(cut1));
        showDate.setMonth(showDate.getMonth() - 1);
        showProcess(showDate);
    }
    showDate.setFullYear(today.getFullYear());
}

// 次の月を表示
function next() {
    let str = document.querySelector('#header').textContent;
    let cut1 = str.substr(0, str.indexOf('年'));
    if (cut1 == showDate.getFullYear()) {
        showDate.setMonth(showDate.getMonth() + 1);
        showProcess(showDate);
    } else {
        showDate.setFullYear(parseInt(cut1));
        showDate.setMonth(showDate.getMonth() + 1);
        showProcess(showDate);
    }
    showDate.setFullYear(today.getFullYear());
}
// カレンダー表示
function showProcess(date) {
    var year = date.getFullYear();
    var month = date.getMonth();
    document.querySelector('#header').innerHTML = year + "年 " + (month + 1) + "月";
    var calendar = createProcess(year, month);
    document.querySelector('#calendar').innerHTML = calendar;
}

// カレンダー作成
function createProcess(year, month) {
    // 曜日
    var calendar = "<table><tr class='dayOfWeek'>";
    for (var i = 0; i < week.length; i++) {
        calendar += "<th>" + week[i] + "</th>";
    }
    calendar += "</tr>";

    var count = 0;
    var startDayOfWeek = new Date(year, month, 1).getDay();
    var endDate = new Date(year, month + 1, 0).getDate();
    var lastMonthEndDate = new Date(year, month, 0).getDate();
    var row = Math.ceil((startDayOfWeek + endDate) / week.length);

    // 1行ずつ設定
    for (var i = 0; i < row; i++) {
        calendar += "<tr>";
        // 1colum単位で設定
        for (var j = 0; j < week.length; j++) {
            if (i == 0 && j < startDayOfWeek) {
                // 1行目で1日まで先月の日付を設定
                calendar += "<td class='disabled'>" + (lastMonthEndDate - startDayOfWeek + j + 1) + "</td>";
            } else if (count >= endDate) {
                // 最終行で最終日以降、翌月の日付を設定
                count++;
                calendar += "<td class='disabled'>" + (count - endDate) + "</td>";
            } else {
                // 当月の日付を曜日に照らし合わせて設定
                count++;
                if (year == today.getFullYear()
                    && month == (today.getMonth())
                    && count == today.getDate()) {
                    calendar += "<td class='today' id=days" + count + ">" + count + "</td>";
                } else {
                    calendar += "<td id=days" + count + ">" + count + "</td>";
                }
            }
        }
        calendar += "</tr>";
    }
    return calendar;
}
for (let i = 1; i < 32; i ++) {
    $(document).on('click', '#days' + i, function () {
        console.log(showDate.getFullYear() + "-" + (showDate.getMonth() + 1) + "-" + parseInt(this.textContent) > today.getFullYear() + "-" + (today.getMonth() + 1) + "-" + parseInt(this.textContent));

        let str = document.querySelector('#header').textContent;
        var cut1 = str.substr(0, str.indexOf('年'));
        //if (showDate.getFullYear() + "/" + showDate.getMonth() + "/"  +  parseInt(this.textContent) == today.getFullYear() + "/" + today.getMonth()+ "/" + today.getDate()) {
          //  window.alert("未来の日付は選択できません！！");
        //} else {
            if (cut1 != showDate.getFullYear()) {
                showDate.setFullYear(parseInt(cut1));
            }
            document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
            document.calendar_date.submit();
        //}
        showDate.setFullYear(today.getFullYear());
    });
}

/*
$(document).on('click', '#days' + 1, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    console.log("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent)
    }
});
$(document).on('click', '#days' + 2, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 3, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 4, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 5, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 6, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 7, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 8, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 9, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 10, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 11, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 12, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 13, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 14, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 15, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 16, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 17, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 18, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 19, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 20, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 21, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 22, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 23, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 24, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 25, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 26, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 27, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 28, function () {
    let str = document.querySelector('#header').textContent;
    let cut1 = str.substr(0, str.indexOf('年'));

    if (showDate.getFullYear() >= today.getFullYear() && showDate.getMonth() >= today.getMonth() && parseInt(this.textContent) > today.getDate()) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
    console.log(showDate.getFullYear() >= today.getFullYear() && showDate.getMonth() >= today.getMonth() && parseInt(this.textContent) > today.getDate())
    console.log(parseInt(this.textContent) > today.getDate());
    console.log("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
});
$(document).on('click', '#days' + 29, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 30, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
$(document).on('click', '#days' + 31, function () {
    if (showDate > today) {
        window.alert("未来の日付は選択できません！！");
    } else {
    console.log(showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
   document.getElementById('calendar_date').setAttribute("value", showDate.getFullYear() + "/" + (showDate.getMonth() + 1) + "/" + this.textContent);
    document.calendar_date.submit();
    }
});
*/