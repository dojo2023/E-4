package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// プロフィール編集画面にフォワードする
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/profile.jsp");
				dispatcher.forward(request, response);

		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		// リクエストパラメータを取得する name属性要確認
		request.setCharacterEncoding("UTF-8");
		//NUMBER(regist.jspのname属性)を入れる変数 number
		String number = request.getParameter("NUMBER");
		String company = request.getParameter("COMPANY");
		String department = request.getParameter("DEPARTMENT");
		String position = request.getParameter("POSITION");
		String name = request.getParameter("NAME");
		String zipcode = request.getParameter("ZIPCODE");
		String address = request.getParameter("ADDRESS");
		String tel = request.getParameter("TEL");
		String email = request.getParameter("EMAIL");
		String remarks = request.getParameter("REMARKS");

		//プロフィール変更点を登録
		UserDao uDao = new UserDao();
			uDao.update(new udao(user_id, password, name, height, weight, target_weight)

		//更新した内容で更新画面に戻る

		//requestスコープに格納


	}


}
}