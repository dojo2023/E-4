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
import model.ManageSlide;
import model.User;

/**
 * Servlet implementation class SlideServlet
 */
@WebServlet("/SlideServlet")
public class SlideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		//if (session.getAttribute("id") == null) {
			//response.sendRedirect("/sobaudon/LoginServlet");
			//return;
		//}

		// スライドショーページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/slide.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		//if (session.getAttribute("id") == null) {
			//response.sendRedirect("/sobaudon/LoginServlet");
			//return;
		//}
		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				User user_id1 = (User)session.getAttribute("profile");
				String user_id = user_id1.getUser_id();
				String name = user_id1.getName();
				String picture = null;

				// 検索処理を行う
				ManageDao mDao = new ManageDao();
				List<ManageSlide> manageSlideList = mDao.selectSlide(new ManageSlide(user_id, name, picture));





				// 検索結果をリクエストスコープに格納する
				request.setAttribute("manageSlideList", manageSlideList);



				// 結果ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/slide.jsp");
				dispatcher.forward(request, response);
	}

}
