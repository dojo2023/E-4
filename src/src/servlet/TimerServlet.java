package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimerServlet
 */
@WebServlet("/TimerServlet")
public class TimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Timer timer = new Timer(false);
		SimpleDateFormat year = new SimpleDateFormat("2023/06/27 17:32:00");
		String year1 = (String)year.format(cal.getTime());
		//int year2 = Integer.parseInt(year1);
		SimpleDateFormat month = new SimpleDateFormat("MM");
		String month1 = (String)month.format(cal.getTime());
		int month2 = Integer.parseInt(month1);
		SimpleDateFormat date = new SimpleDateFormat("dd");
		String date1 = (String)date.format(cal.getTime());
		int date2 = Integer.parseInt(date1);
		SimpleDateFormat hour = new SimpleDateFormat("HH");
		String hour1 = (String)hour.format(cal.getTime());
		int hour2 = Integer.parseInt(hour1);
		SimpleDateFormat min = new SimpleDateFormat("mm");
		String min1 = (String)min.format(cal.getTime());
		int min2 = Integer.parseInt(min1);

		System.out.println(year1);


		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("てすと");



			}
		};

		//while(true) {

			try {
				timer.schedule(task, sdf.parse(year1));

				System.out.println(year1);

				Date year2 = year.parse(year1);

				System.out.println(year2); //この前が

				Calendar calendar = Calendar.getInstance();
		        calendar.setTime(year2);

		        // 日時を加算する
		        calendar.add(Calendar.MINUTE,1);

		        year2 = calendar.getTime();

		        System.out.println(year2);

		        year1 = sdf.format(year2);

		        System.out.println(year1);

			} catch (ParseException e) {
				e.printStackTrace();
		}



		//}


	}

}
