package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		String year1 = (String)year.format(cal.getTime());
		int year2 = Integer.parseInt(year1);
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


		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("てすと");
				SimpleDateFormat year = new SimpleDateFormat("yyyy");
				String year1 = (String)year.format(cal.getTime());
				int year2 = Integer.parseInt(year1);
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


			}
		};
			try {
				timer.schedule(task, sdf.parse( year2 + "/" + month2 + "/" + date2 + " " +  hour2 + ":" + min2 + ":" + "00"));
			} catch (ParseException e) {
				e.printStackTrace();
		}
	}

}
