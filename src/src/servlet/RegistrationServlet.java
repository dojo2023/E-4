package servlet;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
import model.User;

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

		Calendar cal = Calendar.getInstance();
		//SimpleDateFormatで書式を指定
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        //Calendarの日付をSimpleDateFormatで指定した書式で文字列に変換
        //System.out.println(sdf.format(cal.getTime()));

        //if ((int)sdf < 3) {}

        User user_id1 = (User)session.getAttribute("profile");
		String user_id = user_id1.getUser_id();
		String date = (String)sdf.format(cal.getTime());

		ManageDao md = new ManageDao();
		Manage data = md.select(user_id , date);
		if (data == null) {
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
			String lctext = request.getParameter("LCTEXT");

			String dn_se_st = request.getParameter("DN_SE_ST");
			String dn_se_ma = request.getParameter("DN_SE_MA");
			String dn_se_si = request.getParameter("DN_SE_SI");
			String dn_se_no = request.getParameter("DN_SE_NO");
			String dn_se_ot = request.getParameter("DN_SE_OT");
			String dinner = (dn_se_st + dn_se_ma + dn_se_si + dn_se_no + dn_se_ot);
			String dntext = request.getParameter("DNTEXT");

			int snack = Integer.parseInt(request.getParameter("SNACK"));
			int exercise = Integer.parseInt(request.getParameter("EXERCISE"));
			int drink = Integer.parseInt(request.getParameter("DRINK"));

			double dayweight = Double.parseDouble(request.getParameter("DAYWEIGHT"));
			User height1 = (User)session.getAttribute("profile");
			double height = height1.getHeight();
			double bmi = ((dayweight/height)/height);
			String picture = request.getParameter("PICTURE");

			//partオブジェクトとしてnameがpictureのものを取得
			Part part = request.getPart("PICTURE");
			//ファイル名を取得
			String filename = part.getSubmittedFileName();
			//String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
			//アップロードするフォルダ
			String path = getServletContext().getRealPath("/body");

			System.out.println(path);

			part.write(path+File.separator+filename);

			picture = "sobaudon/body/"+filename;

			//登録を押した際のカウント
			String counter = "0" ;
			if(request.getParameter("submit").equals("登録")) {
				counter = "1";
			}

			ManageDao mDao = new ManageDao();
			mDao.update(new Manage(user_id , date , breakfast , bftext , lunch , lctext , dinner , dntext , snack , exercise , drink , dayweight , picture , bmi , counter));

		}else {

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
		String lctext = request.getParameter("LCTEXT");

		String dn_se_st = request.getParameter("DN_SE_ST");
		String dn_se_ma = request.getParameter("DN_SE_MA");
		String dn_se_si = request.getParameter("DN_SE_SI");
		String dn_se_no = request.getParameter("DN_SE_NO");
		String dn_se_ot = request.getParameter("DN_SE_OT");
		String dinner = (dn_se_st + dn_se_ma + dn_se_si + dn_se_no + dn_se_ot);
		String dntext = request.getParameter("DNTEXT");

		int snack = Integer.parseInt(request.getParameter("SNACK"));
		int exercise = Integer.parseInt(request.getParameter("EXERCISE"));
		int drink = Integer.parseInt(request.getParameter("DRINK"));

		double dayweight = Double.parseDouble(request.getParameter("DAYWEIGHT"));
		User height1 = (User)session.getAttribute("profile");
		double height = height1.getHeight();
		double bmi = ((dayweight/height)/height);
		String picture = request.getParameter("PICTURE");

		//partオブジェクトとしてnameがpictureのものを取得
		Part part = request.getPart("PICTURE");
		//ファイル名を取得
		String filename = part.getSubmittedFileName();
		//String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
		//アップロードするフォルダ
		String path = getServletContext().getRealPath("/body");

		System.out.println(path);

		part.write(path+File.separator+filename);

		picture = "sobaudon/body/"+filename;

		//登録を押した際のカウント
		String counter = "0" ;
		if(request.getParameter("submit").equals("登録")) {
			counter = "1";
		}

		ManageDao mDao = new ManageDao();
		mDao.insert(new Manage(user_id , date , breakfast , bftext , lunch , lctext , dinner , dntext , snack , exercise , drink , dayweight , picture , bmi , counter));

		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
		dispatcher.forward(request, response);

	}

}

