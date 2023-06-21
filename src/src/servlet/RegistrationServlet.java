package servlet;

import java.io.File;
import java.io.IOException;

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
	//location="C:\\dojo6\\src\\WebContent\\body",
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

	/*	//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/servlet/LoginServlet");
			return;
		}
	*/
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String bf_se_st = request.getParameter("BF_SE_ST");
		String bf_se_ma = request.getParameter("BF_SE_MA");
		String bf_se_si = request.getParameter("BF_SE_SI");
		String bf_se_no = request.getParameter("BF_SE_NO");
		String bf_se_ot = request.getParameter("BF_SE_OT");
		String bftext = request.getParameter("BFTEXT");

		String lu_se_st = request.getParameter("LU_SE_ST");
		String lu_se_ma = request.getParameter("LU_SE_MA");
		String lu_se_si = request.getParameter("LU_SE_SI");
		String lu_se_no = request.getParameter("LU_SE_NO");
		String lu_se_ot = request.getParameter("LU_SE_OT");
		String lutext = request.getParameter("LUTEXT");

		String di_se_st = request.getParameter("DI_SE_ST");
		String di_se_ma = request.getParameter("DI_SE_MA");
		String di_se_si = request.getParameter("DI_SE_SI");
		String di_se_no = request.getParameter("DI_SE_NO");
		String di_se_ot = request.getParameter("DI_SE_OT");
		String ditext = request.getParameter("DITEXT");

		String exercise = request.getParameter("EXERCISE");
		String drink = request.getParameter("DRINK");
		String snack = request.getParameter("SNACK");
		String dayweight = request.getParameter("DAYWEIGHT");
		String picture = request.getParameter("PICTURE");

		//partオブジェクトとしてnameがpictureのものを取得
		Part part = request.getPart("picture");
		//ファイル名を取得
		String filename = part.getSubmittedFileName();
		//String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		//アップロードするフォルダ
		String path = getServletContext().getRealPath("/body");

		System.out.println(path);

		part.write(path+File.separator+filename);

		//登録を押した際のカウント
		int count = 0 ;
		if(request.getParameter("submit").equals("登録")) {
			count++;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);
	}

}

