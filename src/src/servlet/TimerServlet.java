package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
		SimpleDateFormat year = new SimpleDateFormat("2023/06/28 10:25:00");
		String year1 = (String)year.format(cal.getTime());
		Date year2 = sdf.parse(year1);
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(year2);


		ScheduledExecutorService service
		= Executors.newSingleThreadScheduledExecutor();

		service.scheduleAtFixedRate(() -> {
			System.out.println(
					"ループ内のID=" + Thread.currentThread().getId()); // 12
		}, 0, 3, TimeUnit.DAYS.convert(calendar.getTime()));






		/*int year2 = Integer.parseInt(year1);

		System.out.println(year1);



		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("てすと");
				timer.cancel();




			}


		};


		while(true) {

			try {

				timer.schedule(task, sdf.parse(year1));

				task.cancel();




				System.out.println(year1);

				Date year2 = sdf.parse(year1);

				System.out.println(year2);

				Calendar calendar = Calendar.getInstance();
		        calendar.setTime(year2);

		        // 日時を加算する
		        calendar.add(Calendar.MINUTE,1);

		        year2 = calendar.getTime();

		        System.out.println(year2);

		        year1 = sdf.format(year2);

		        System.out.println(year1);


			} catch (ParseException e) {
				task.cancel();
			}

		}*/
	}
}
