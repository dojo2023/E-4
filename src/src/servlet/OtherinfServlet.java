package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManageDao;
import dao.UserDao;
import model.Manage;
import model.User;

/**
 * Servlet implementation class OtherinfServlet
 */
@WebServlet("/OtherinfServlet")

public class OtherinfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		User user_id1 = (User)session.getAttribute("profile");
		if (user_id1.getUser_id() == null) {
			response.sendRedirect("/servlet/LoginServlet");
			return;
		}

		// リクエストパラメータを取得する
			request.setCharacterEncoding("UTF-8");
			String user_id = request.getParameter("else_user");
			String date = request.getParameter("calendar");

		ManageDao mDao = new ManageDao();
		Manage search = mDao.select(user_id , date);

		String pw = "";
		String name ="";
		Double height = null;
		Double weight = null;
		Double target_weight = null;
		UserDao uDao = new UserDao();
		User profile2 = uDao.detail(new User(user_id,pw,name,height,weight,target_weight));
		String name2 = profile2.getName();

		request.setAttribute("name2", name2);
		request.setAttribute("search", search);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/otherinf.jsp");
		dispatcher.forward(request, response);
	}

}
