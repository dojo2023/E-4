package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManageDao;
import model.Manage;
import model.User;

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
		HttpSession session = request.getSession();
	/*	if (session.getAttribute("profile") == null) {
			response.sendRedirect("/sobaudon/LoginServlet");
			return;
		}
	*/

		Calendar cal = Calendar.getInstance();
		//SimpleDateFormatで書式を指定
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		User user_id1 = (User)session.getAttribute("profile");
		String user_id = user_id1.getUser_id();
		String date = (String)sdf1.format(cal.getTime());

		// 他人情報ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/otherinf.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//もしログインしていなかったらログインサーブレットへリダイレクト
		HttpSession session = request.getSession();
	/*	if (session.getAttribute("profile") == null) {
			response.sendRedirect("/servlet/LoginServlet");
			return;
		}
	*/
		// リクエストパラメータを取得する
			request.setCharacterEncoding("UTF-8");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
			Calendar cal = Calendar.getInstance();
			User user_id1 = (User)session.getAttribute("profile");
			String user_id = user_id1.getUser_id();
			String date = (String)sdf1.format(cal.getTime());

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

			double dayweight = Double.parseDouble(request.getParameter("DAYWEIGHT"));
			double bmi = 0;
			String picture = null;
			String counter = null;

		ManageDao mDao = new ManageDao();
		mDao.insert(new Manage(user_id , date , breakfast , bftext , lunch , lctext , dinner , dntext , snack , exercise , drink , dayweight , picture , bmi , counter));


		Manage oth_search = md.select(user_id , date);
		request.setAttribute("oth_search", oth_search);
	}

}
