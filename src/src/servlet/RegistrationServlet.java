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
import model.Manage;
import model.Result;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}

		// 登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String breakfast = request.getParameter("bf_select");
		String bftext = request.getParameter("bf_remarks");
		String lunch = request.getParameter("lu_select");
		String lctext = request.getParameter("lu_text");
		String dinner = request.getParameter("di_select");
		String dntext = request.getParameter("di_text");
		int exercise = request.getParameter("stretch");
		int drink = request.getParameter("drink");
		int snack = request.getParameter("snack");
		double dayweight = request.getParameter("weight");
		String picture = request.getParameter("pic");
	}

	// 登録処理を行う
	ManageDao mDao = new ManageDao();
	if (mDao.insert(new Manage(breakfast ,bftext ,lunch ,lctext ,dinner ,dntext ,exercise ,drink ,snack ,dayweight ,picture))) {
		// 登録成功
		request.setAttribute("result",
		new Result("登録成功！", "レコードを登録しました。", "/simpleBC/MenuServlet"));
	}
	else {
		// 登録失敗
		request.setAttribute("result",
		new Result("登録失敗！", "レコードを登録できませんでした。", "/simpleBC/MenuServlet"));
	}

}

