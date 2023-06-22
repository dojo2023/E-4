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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログインページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("USER_ID");
		String pw = request.getParameter("PASSWORD");
		String name ="";
		Double height = null;
		Double weight = null;
		Double target_weight = null;

		// ログイン処理を行う
		UserDao uDao = new UserDao();
		if (uDao.Login(new User(id, pw, name, height, weight, target_weight))) {	// ログイン成功
		User loginUser = new User(id, pw, name, height, weight, target_weight);

		//個人のプロフィール取得する
		User profile = uDao.detail(loginUser);

		// セッションスコープにIDを格納する
		HttpSession session = request.getSession();
		session.setAttribute("profile", profile);

		// 登録サーブレットにリダイレクトする
		response.sendRedirect("/sobaudon/RegistrationServlet");
	}

	else {
		// ログイン失敗
		//エラーメッセージを設定
		String error = "IDまたはパスワードが一致しません。";

		//エラーメッセージをリクエストスコープに格納
		request.setAttribute("error", error);

		// ログインページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}
  }
}