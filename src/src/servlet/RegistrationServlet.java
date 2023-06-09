package servlet;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
	maxFileSize=10000000

)

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		User user_id12 = (User)session.getAttribute("profile");
		if (user_id12.getUser_id() == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}

		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");

				Calendar cal = Calendar.getInstance();
				//SimpleDateFormatで書式を指定
		        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		        User user_id1 = (User)session.getAttribute("profile");
				String user_id = user_id1.getUser_id();
				String date = (String)sdf1.format(cal.getTime());

				ManageDao md = new ManageDao();
				Manage data = null;
				data = md.select(user_id , date);
				if (data.getDate() == "" && data.getUser_id() == "") {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");
					dispatcher.forward(request, response);
				}else {
					response.sendRedirect("/sobaudon/UpdateServlet");
				}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
		User user_id12 = (User)session.getAttribute("profile");
		if (user_id12.getUser_id() == null) {
			response.sendRedirect("/servlet/LoginServlet");
			return;
		}
		Calendar cal = Calendar.getInstance();
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String date = "";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
		String date1 = (String)sdf2.format(cal.getTime());
		int sdf3= Integer.parseInt(date1);

		if (sdf3 < 3) {
			Date newdate = new Date();
			// Date型の日時をCalendar型に変換
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(newdate);

	        // 日時を加算する
	        calendar.add(Calendar.DATE, -1);

	        // Calendar型の日時をDate型に戻す
	        Date d1 = calendar.getTime();
	        date = sdf1.format(d1);
		} else {
			date = (String)sdf1.format(cal.getTime());
		}

        User user_id1 = (User)session.getAttribute("profile");
		String user_id = user_id1.getUser_id();
		ManageDao md = new ManageDao();

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

			double dayweight = 0;
			String dw = request.getParameter("DAYWEIGHT");
			if (dw.equals("")) {
					dayweight = 0;
			} else {
					dayweight = Double.parseDouble(dw);
			}
			User height1 = (User)session.getAttribute("profile");
			double height = height1.getHeight();
			height = height / 100;
			double bmi1 = ((dayweight/height)/height);
			double bmi = Math.floor(bmi1 * 10) / 10;

			String picture;
			//partオブジェクトとしてnameがpictureのものを取得
			Part part = request.getPart("PICTURE");
			//ファイル名を取得
			String filename = part.getSubmittedFileName();
			//String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
			//アップロードするフォルダ
			String path = getServletContext().getRealPath("/body");

			System.out.println(path);

			try {
				part.write(path+File.separator+filename);
				picture = "/sobaudon/body/"+filename;
				} catch(java.io.IOException e) {
					e.printStackTrace();
					picture = "";
				}
			//登録を押した際のカウント
			String counter = "0" ;
			if(request.getParameter("submit").equals("登録")) {
				counter = "1";
			}

			ManageDao mDao = new ManageDao();
			mDao.insert(new Manage(user_id , date , breakfast , bftext , lunch , lctext , dinner , dntext , snack , exercise , drink , dayweight , picture , bmi , counter));

		Manage search = md.select(user_id , date);
		System.out.println(search.getBmi());
		request.setAttribute("search", search);

		response.sendRedirect("/sobaudon/UpdateServlet");

	}

}

