package servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManageDao;
import dao.UserDao;
import model.Graph;
import model.User;

/**
 * Servlet implementation class BrowseServlet
 */
@WebServlet("/BrowseServlet")
public class BrowseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("profile") == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}
		request.setCharacterEncoding("UTF-8");
		String else_id = request.getParameter("USER_ID");
		String pw = "";
		String name ="";
		Double height = null;
		Double weight = null;
		Double target_weight = null;
		UserDao uDao = new UserDao();
		User profile2 = uDao.detail(new User(else_id,pw,name,height,weight,target_weight));
			String date = "";
			double dayweight = 0;
			double bmi = 0;

			ManageDao md = new ManageDao();
			//登録した過去30日分のuser_id、日付、体重、bmiを取得
			List<Graph> lg = md.selectGraph(new Graph(else_id,date,dayweight,bmi));
			Collections.reverse(lg);
			request.setAttribute("lg", lg);
			request.setAttribute("profile2", profile2);

			// 閲覧ページにフォワードする
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/browse.jsp");
			dispatcher.forward(request, response);
	}

}
