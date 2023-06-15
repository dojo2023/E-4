package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		//HttpSession session = request.getSession();
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
		//HttpSession session = request.getSession();
		//if (session.getAttribute("id") == null) {
			//response.sendRedirect("/sobaudon/LoginServlet");
			//return;
		//}
		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String number = request.getParameter("NUMBER");
				String company = request.getParameter("COMPANY");
				String department = request.getParameter("DEPARTMENT");
				String position = request.getParameter("POSITION");
				String name = request.getParameter("NAME");
				String zipcode = request.getParameter("ZIPCODE");
				String address = request.getParameter("ADDRESS");
				String phone = request.getParameter("PHONE");
				String fax = request.getParameter("FAX");
				String email = request.getParameter("EMAIL");
				String remarks = request.getParameter("REMARKS");

				// 検索処理を行う
				//BcDAO bDao = new BcDAO();
				//List<Bc> cardList = bDao.select(new Bc(number, company, department, position, name, zipcode, address, phone, fax, email, remarks));





				// 検索結果をリクエストスコープに格納する
				//request.setAttribute("cardList", cardList);



				// 結果ページにフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search_result.jsp");
				dispatcher.forward(request, response);
	}

}
