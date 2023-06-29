google.load("visualization", "1", { packages: ["corechart"] });
google.setOnLoadCallback(drawChart);
function drawChart() {
	const ItemList = document.getElementsByClassName("data");
  const DataList = [];
  //valu属性の値を取得
  for(let i = 0; i < ItemList.length; i++) {
    value = ItemList.item(i).value;
    if (value.length !== 10) {
      value = parseFloat(value);
    } else {
      value = value.substr(value.indexOf('/') + 1);
    }
    DataList.push(value);
      console.log(value);
  }
  //取得した要素を3つずつ区切る
  const sliceByNumber = (array, number) => {
    const length = Math.ceil(array.length / number)
    return new Array(length).fill().map((_, i) =>
      array.slice(i * number, (i + 1) * number));
  }
  let sl = sliceByNumber(DataList, 3);
  for(let i = 0; i < 31; i++) {
  if (sl.length < i) {
    sl.push([null,null,null])
    }
  }
  var data = google.visualization.arrayToDataTable([
    ['x', '体重(kg)', 'BMI'],
    sl[0],sl[1],sl[2],sl[3],sl[4],sl[5],sl[6],sl[7],sl[8],sl[9],
    sl[10],sl[11],sl[12],sl[13],sl[14],sl[15],sl[16],sl[17],sl[18],sl[19],
    sl[20],sl[21],sl[22],sl[23],sl[24],sl[25],sl[26],sl[27],sl[28],sl[29]
  ]);

  var options = {
    title: '過去30日分の体重とBMIの推移',
    series: [
      { targetAxisIndex: 0 }, // 第1系列は左のY軸を使用
      { targetAxisIndex: 1 }, // 第2系列は右のY時を使用
    ]
  };

  var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
  chart.draw(data, options);
}