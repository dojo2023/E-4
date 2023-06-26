package servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManageDao;
import model.Graph;
import model.Manage;

/**
 * Servlet implementation class BrowseServlet
 */
@WebServlet("/BrowseServlet")
public class BrowseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("profile") == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}
		// 閲覧ページにフォワードする
		request.setCharacterEncoding("UTF-8");
		if (request.getParameter("submit").equals("submit")) {
			String else_id = request.getParameter("USER_ID");
			String date = "";
			double dayweight = 0;
			double bmi = 0;
			ManageDao md = new ManageDao();
			List<Graph> lg = md.selectGraph(new Graph(else_id,date,dayweight,bmi));
			Collections.reverse(lg);
			request.setAttribute("lg",lg );
			request.setAttribute("else_id",else_id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/otherinf.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setCharacterEncoding("UTF-8");
			String else_id = request.getParameter("else");
			String date = request.getParameter("calendar");
			System.out.println(date);
			ManageDao md = new ManageDao();
			Manage search = md.select(else_id, date );
			request.setAttribute("search", search);
			response.sendRedirect("/sobaudon/OtherinfServlet");
		}
	}
}
