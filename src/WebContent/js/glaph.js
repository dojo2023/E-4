google.load("visualization", "1", { packages: ["corechart"] });
google.setOnLoadCallback(drawChart);
function drawChart() {
  var data = google.visualization.arrayToDataTable([
    ['x', '体重(kg)', 'BMI(適正は22ぐらい)'],
    [1, 60.5, 23.5], [2, 62, 23.6], [3, 61, 23.4], [4, 62.3, 24.3], [5, 61.7, 22.3],
    [6, 60.5, 23.5], [7, 60, 23.5], [8, 59.5, 23.5], [9, 59, 23.5], [10, 58, 23.5], [11, 59.5, 23.5],
    [12, 60, 23.5], [13, 60.3, 23.5], [14, 58.3, 23.5], [15, 57.5, 23.5], [16, 58.2, 23.5], [17, 59, 23.5],
    [18, 58, 23.5], [19, 58.3, 23.5], [20, 57.5, 23.5], [21, 57.3, 23.5], [22, 58, 23.5], [23, 57.2, 23.5],
    [24, 57.3, 23.5], [25, 56.5, 23.5], [26, 57.5, 23.5], [27, 57.3, 23.5], [28, 56.5, 23.5], [29, 57.3, 23.5],
    [30, 55, 23.5],
  ]);

  var options = {
    title: '体重とBMIの推移',
    series: [
      { targetAxisIndex: 0 }, // 第1系列は左のY軸を使用
      { targetAxisIndex: 1 }, // 第2系列は右のY時を使用
    ]
  };

  var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
  chart.draw(data, options);
}