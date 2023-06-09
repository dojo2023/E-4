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
		// リクエストパラメータを取得する
			request.setCharacterEncoding("UTF-8");
			HttpSession session = request.getSession();
			User user_id1 = (User)session.getAttribute("profile");
		if (user_id1.getUser_id() == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}
		// リクエストパラメータを取得する
		String user_id = user_id1.getUser_id();

		// 検索処理を行う
		ManageDao mDao = new ManageDao();
		List<ManageSlide> manageSlideList = mDao.selectSlide(user_id);

		for(ManageSlide li:manageSlideList) {
			System.out.println(li.getDate());
		}
		// 検索結果をリクエストスコープに格納する
		request.setAttribute("manageSlideList", manageSlideList);

		// スライドショーページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/slide.jsp");
		dispatcher.forward(request, response);
	}
}
