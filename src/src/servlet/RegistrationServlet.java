package servlet;

import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
@MultipartConfig(
location="/tmp/files",
maxFileSize=1000000
)

public class RegistrationServlet extends HttpServlet {
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

	/*	//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/servlet/LoginServlet");
			return;
		}
	*/
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String breakfast = request.getParameter("BREAKFAST");
		String bftext = request.getParameter("BFTEXT");
		String lunch = request.getParameter("LUNCH");
		String lctext = request.getParameter("LCTEXT");
		String dinner = request.getParameter("DINNER");
		String dntext = request.getParameter("DNTEXT");
		int exercise = Integer.parseInt(request.getParameter("EXERCISE"));
		int drink = Integer.parseInt(request.getParameter("DRINK"));
		int snack = Integer.parseInt(request.getParameter("SNACK"));
		double dayweight = Double.parseDouble(request.getParameter("DAYWEIGHT"));
		String picture = request.getParameter("PICTURE");

		//partオブジェクトとしてnameがpictureのものを取得
		Part part = request.getPart(picture);
		//ファイル名を取得
		String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		//アップロードするフォルダ
		String path = getServletContext().getRealPath("/upload");

		//登録を押した際のカウント
		int count = Integer.parseInt(request.getParameter("submit"));
		if(request.getParameter("submit").equals("登録")) {
			count++;
		}

	}

}

