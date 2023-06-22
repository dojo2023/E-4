package servlet;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManageDao;
import model.Graph;
import model.User;


/**
 * Servlet implementation class CalendarServlet
 */
@WebServlet("/CalendarServlet")
public class CalendarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //もしもログインしていなかったらログインサーブレットにリダイレクトする
				HttpSession session = request.getSession();
				if (session.getAttribute("profile") == null) {
					response.sendRedirect("/sobaudon/LoginServlet");
					return;
				}
		//セッションスコープからuser_idを取得
				User usr =  (User)session.getAttribute("profile");
				String user_id = usr.getUser_id();
				//Calendar cal = Calendar.getInstance();
		        //SimpleDateFormatで書式を指定
		        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		        //Calendarの日付をSimpleDateFormatで指定した書式で文字列に変換
		        //System.out.println(sdf.format(cal.getTime()));
				String date = "";
				double dayweight = 0;
				double bmi = 0;


				//Manage graph = new Manage(user_id,date,date,breakfast,bftext,
					//	lunch,dinner,dntext,snack,exercise,drink,dayweight,picture,bmi,counter);

				ManageDao md = new ManageDao();
		//登録した過去30日分のuser_id、日付、体重、bmiを取得
				List<Graph> lg = md.selectGraph(new Graph(user_id,date,dayweight,bmi));
				request.setAttribute("lg", lg);
				for(Graph graph : lg) {
			        System.out.println(graph.getUser_id() +  "," + graph.getDate() + "," + graph.getDayweight() + "," + graph.getBmi());
				}
				// カレンダーページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/calendar.jsp");
				dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* もしもログインしていなかったらログインサーブレットにリダイレクトする
				HttpSession session = request.getSession();
				if (session.getAttribute("id") == null) {
					response.sendRedirect("/servlet/LoginServlet");
					return;
				}*/

		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String date = request.getParameter("calendar_date");

				//Manage graph = new Manage(user_id , date ,breakfast ,bftext ,lunch ,lctext ,dinner ,dntext,snack ,exercise ,drink ,dayweight,picture,bmi,counter);


				// 更新ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/update.jsp");
				dispatcher.forward(request, response);
	}

}
