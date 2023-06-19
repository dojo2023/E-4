package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OtherinfServlet
 */
@WebServlet("/OtherinfServlet")
public class OtherinfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//もしログインしていなかったらログインサーブレットへリダイレクト
	/*	HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}
	*/
		// 他人情報ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/otherinf.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	/*	//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/servlet/LoginServlet");
			return;
		}
	*/
	}

}
