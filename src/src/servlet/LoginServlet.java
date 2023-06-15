package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.Idpw;
import model.LoginUser;
import model.Result;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
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
	String id = request.getParameter("user_id");
	String pw = request.getParameter("password");

	// ログイン処理を行う
	UserDao iDao = new UserDao();
	if (iDao.isLoginOK(new UserDao(user_id, password))) {	// ログイン成功
		// セッションスコープにIDを格納する
		HttpSession session = request.getSession();
		session.setAttribute("id", new LoginUser(id));

		// 登録画面にリダイレクトする
		response.sendRedirect("/sobaudon/src/RegistrationServlet.java");
	}

	else {									// ログイン失敗
		// リクエストスコープに、タイトル、メッセージ、戻り先を格納する
		request.setAttribute("result",
		new Result("ログイン失敗！", "IDまたはPWに間違いがあります。", "/WEB-INF/jsp/login.jsp"));

		// 結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);
	}
}