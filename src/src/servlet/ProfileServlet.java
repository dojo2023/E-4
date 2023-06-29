package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
    	User usr =  (User)session.getAttribute("profile");
		if (usr.getUser_id() == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}

		//ユーザのプロフィールをセッションスコープから取得
		User user_inf = (User)session.getAttribute("profile");

		//をリクエストスコープに格納する
		request.setAttribute("user_inf", user_inf);

		// プロフィール編集画面にフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/profile.jsp");
		dispatcher.forward(request, response);

		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("USER_ID");
		String password = request.getParameter("PASSWORD");
		String name = request.getParameter("NAME");
		Double height = Double.parseDouble(request.getParameter("HEIGHT"));
		Double weight = Double.parseDouble(request.getParameter("WEIGHT"));
		Double target_weight = Double.parseDouble(request.getParameter("TARGET_WEIGHT"));

		//プロフィール変更点を登録
		UserDao uDao = new UserDao();
		uDao.update(new model.User(user_id, password, name, height, weight, target_weight));

		//保存していたユーザ情報を削除 p239
		HttpSession session = request.getSession();
		session.removeAttribute("profile");

		//検索処理を行う
		User profile = uDao.detail(new model.User(user_id, password, name, height, weight, target_weight));

		//更新したユーザのプロフィールをセッションスコープに格納する
		session.setAttribute("profile", profile);

		//更新した内容で更新画面に戻る
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/profile.jsp");
		dispatcher.forward(request, response);
	}
}
