package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class NewServlet
 */
@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 新規登録ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/new.jsp");
				dispatcher.forward(request, response);
			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		//NUMBER(regist.jspのname属性)を入れる変数 number
		String user_id = request.getParameter("USER_ID");
		String password = request.getParameter("PASSWORD");
		String name = request.getParameter("NAME");
		Double height = Double.parseDouble(request.getParameter("HEIGHT"));
		Double weight = Double.parseDouble(request.getParameter("WEIGHT"));
		Double target_weight = Double.parseDouble(request.getParameter("TARGET_WEIGHT"));

		UserDao uDao = new UserDao();
		//個別に受け取ってjavabeansに入れている
		uDao.insert(new model.User(user_id, password, name, height, weight, target_weight));

		// ログインページにリダイレクトする
		response.sendRedirect("/sobaudon/LoginServlet");
	}


}
