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
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import dao.ManageDao;
import model.Manage;

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
		HttpSession session = request.getSession();
	/*	if (session.getAttribute("id") == null) {
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

		//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
	/*	if (session.getAttribute("id") == null) {
			response.sendRedirect("/servlet/LoginServlet");
			return;
		}
	*/
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String user_id = (String)session.getAttribute("USER_ID");
		String date = (String)session.getAttribute("DATE");

		String bf_se_st = request.getParameter("BF_SE_ST");
		String bf_se_ma = request.getParameter("BF_SE_MA");
		String bf_se_si = request.getParameter("BF_SE_SI");
		String bf_se_no = request.getParameter("BF_SE_NO");
		String bf_se_ot = request.getParameter("BF_SE_OT");
		String breakfast = (bf_se_st + bf_se_ma + bf_se_si + bf_se_no + bf_se_ot);
		String bftext = request.getParameter("BFTEXT");

		String lc_se_st = request.getParameter("LC_SE_ST");
		String lc_se_ma = request.getParameter("LC_SE_MA");
		String lc_se_si = request.getParameter("LC_SE_SI");
		String lc_se_no = request.getParameter("LC_SE_NO");
		String lc_se_ot = request.getParameter("LC_SE_OT");
		String lunch = (lc_se_st + lc_se_ma + lc_se_si + lc_se_no + lc_se_ot);
		String lctext = request.getParameter("LUTEXT");

		String dn_se_st = request.getParameter("DN_SE_ST");
		String dn_se_ma = request.getParameter("DN_SE_MA");
		String dn_se_si = request.getParameter("DN_SE_SI");
		String dn_se_no = request.getParameter("DN_SE_NO");
		String dn_se_ot = request.getParameter("DN_SE_OT");
		String dinner = (dn_se_st + dn_se_ma + dn_se_si + dn_se_no + dn_se_ot);
		String dntext = request.getParameter("DITEXT");

		String snack1 = request.getParameter("SNACK");
		int snack = Integer.parseInt(snack1);
		String exercise1 = request.getParameter("EXERCISE");
		int exercise = Integer.parseInt(exercise1);
		String drink1 = request.getParameter("DRINK");
		int drink = Integer.parseInt(drink1);
		double dayweight = Double.parseDouble(request.getParameter("DAYWEIGHT"));
		//String height1 = (String)session.getAttribute("HEIGHT");
		String height1 = "1.6";
		double height =Double.parseDouble(height1);
		double bmi = ((dayweight/height)/height);
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
		String counter = "0" ;
		if(request.getParameter("submit").equals("登録")) {
			counter = "1";
		}

		ManageDao mDao = new ManageDao();
		mDao.insert(new Manage(user_id , date ,breakfast ,bftext ,lunch ,lctext ,dinner ,dntext,snack ,exercise ,drink ,dayweight,picture,bmi,counter));
			// 登録成功

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);
	}

}

