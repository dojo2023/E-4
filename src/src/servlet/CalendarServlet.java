package servlet;

import java.io.IOException;
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
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
				//HttpSession session = request.getSession();
				//if (session.getAttribute("profile") == null) {
					//response.sendRedirect("/sobaudon/LoginServlet");
					//return;
				//}
				HttpSession session = request.getSession();
				User usr =  (User)session.getAttribute("profile");
				String user_id = usr.getUser_id();


				//Manage graph = new Manage(user_id,date,date,breakfast,bftext,
					//	lunch,dinner,dntext,snack,exercise,drink,dayweight,picture,bmi,counter);

				ManageDao md = new ManageDao();
				List<Graph> lg = new List<Graph>();




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
				// 更新ページにフォワードする

				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/update.jsp");
				dispatcher.forward(request, response);
	}

}
